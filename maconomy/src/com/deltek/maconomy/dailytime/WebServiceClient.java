/*
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use
 * this file except in compliance with the License. A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0/
 *
 * or in the "license" file accompanying this file. This file is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.deltek.maconomy.dailytime;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.deltek.maconomy.customerentry.CustomerEntries;
import com.deltek.maconomy.expense.ExpenseSheets;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.internal.jackson.jaxrs.json.JacksonJsonProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.*;

/**
 * This is a small wrapper client around the Alexa Device Address API.
 */
public class WebServiceClient {

    private static final Logger log = LoggerFactory.getLogger(WebServiceClient.class);

    private static final String BASE_API_PATH = "http://54.174.46.107:9150/containers/v1/cpademo";//"https://fti-bld.deltekenterprise.com/containers/v1/bldfti";
    private static final String BASE_API_PATH_TIME = BASE_API_PATH + "/dailytimeregistration/data;any";
    private static final String BASE_API_PATH_EXPENSE = BASE_API_PATH + "/expensesheets/data;";
    private static final String BASE_API_PATH_AR = BASE_API_PATH + "/showcustomerreconciliations/filter?restriction=";
    private static final String AUTH_HEADER = "Basic QWRtaW5pc3RyYXRvcjoxMjM0NTY=";//"Basic c3lzYWRtaW46aCg2UTM2IVM3RjcwKGk=";

    public static String insertDailyTime(String employeeNumberVar, String dateVar, Double hours, String jobNumber, String taskName){
        ClientConfig configuration = new ClientConfig();
        configuration.register(DailyTimeRegistration.class);
        configuration.register(JacksonJsonProvider.class);

        Client client = ClientBuilder.newClient(configuration);
        String queryParams = "?card.employeenumbervar=" + employeeNumberVar + "&card.datevar=" + dateVar;
        String getUrl = BASE_API_PATH_TIME + queryParams;

        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        ArrayList<Object> auth = new ArrayList<Object>();
        auth.add(AUTH_HEADER);
        headers.put("Authorization", auth);

        log.info("sending request to url: {}", getUrl);
        DailyTimeRegistration dt = client.target(getUrl).request(MediaType.APPLICATION_JSON).headers(headers).accept(MediaType.APPLICATION_JSON).get(DailyTimeRegistration.class);
        List<Record_> records = dt.getPanes().getCard().getRecords();
        if(records.size() >=1){
            Record_ card = records.get(0);
            Meta____ meta = card.getMeta();
            String concurrencyControl = meta.getConcurrencyControl();
            log.info("found concurrency control key: {}", concurrencyControl);
            ArrayList<Object> concControl = new ArrayList<Object>();
            concControl.add(concurrencyControl);
            headers.put("Maconomy-Concurrency-Control", concControl);

            String postUrl = BASE_API_PATH_TIME + "/table" + queryParams;
            Data data = new Data();
            data.setJobnumber(jobNumber);
            data.setTaskname(taskName);
            data.setNumberof(hours);
            Record table = new Record();
            table.setData(data);
            Response response = client.target(postUrl).request(MediaType.APPLICATION_JSON).headers(headers).accept(MediaType.APPLICATION_JSON).post(Entity.entity(table, MediaType.APPLICATION_JSON));
            return response.getStatusInfo().toString();
        }
        return "";
    }

    public static String insertExpense(String expenseSheetNumber, String taskName, Double quantity){
        ClientConfig configuration = new ClientConfig();
        configuration.register(ExpenseSheets.class);
        configuration.register(JacksonJsonProvider.class);

        Client client = ClientBuilder.newClient(configuration);
        String queryParams = "expensesheetnumber=" + expenseSheetNumber;
        String getUrl = BASE_API_PATH_EXPENSE + queryParams;

        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        ArrayList<Object> auth = new ArrayList<Object>();
        auth.add(AUTH_HEADER);
        headers.put("Authorization", auth);

        log.info("sending request to url: {}", getUrl);
        ExpenseSheets es = client.target(getUrl).request(MediaType.APPLICATION_JSON).headers(headers).accept(MediaType.APPLICATION_JSON).get(ExpenseSheets.class);
        List<com.deltek.maconomy.expense.Record_> records = es.getPanes().getCard().getRecords();
        String jobNumber = "";
        if(records.size() >= 1){
            com.deltek.maconomy.expense.Record_ card = records.get(0);
            com.deltek.maconomy.expense.Meta____ meta = card.getMeta();
            String concurrencyControl = meta.getConcurrencyControl();
            log.info("found concurrency control key: {}", concurrencyControl);
            ArrayList<Object> concControl = new ArrayList<Object>();
            concControl.add(concurrencyControl);
            headers.put("Maconomy-Concurrency-Control", concControl);

            String postUrl = getUrl + "/table";
            com.deltek.maconomy.expense.Data data = new com.deltek.maconomy.expense.Data();
            data.setTaskname(taskName);
            data.setNumberof(quantity);
            com.deltek.maconomy.expense.Record table = new com.deltek.maconomy.expense.Record();
            table.setData(data);
            Response response = client.target(postUrl).request(MediaType.APPLICATION_JSON).headers(headers).accept(MediaType.APPLICATION_JSON).post(Entity.entity(table, MediaType.APPLICATION_JSON));
            String status = response.getStatusInfo().toString();
            if(!status.equalsIgnoreCase("OK")){
                log.error("insert expense line post request returned status: " + status);
            }else{
                jobNumber = card.getData().getJobnumber() + " " + card.getData().getJobname();
            }
        }
        return jobNumber;
    }

    public static String getCashReceipts(String customerNumber, String toDate, String fromDate){
        ClientConfig configuration = new ClientConfig();
        configuration.register(CustomerEntries.class);
        configuration.register(JacksonJsonProvider.class);

        Client client = ClientBuilder.newClient(configuration);
        String queryParams = "customernumber='" + customerNumber + "'";
        String getUrl = BASE_API_PATH_AR + queryParams;

        log.info("sending request to url: {}", getUrl);

        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        ArrayList<Object> auth = new ArrayList<Object>();
        auth.add(AUTH_HEADER);
        headers.put("Authorization", auth);

        CustomerEntries customerEntries = client.target(getUrl).request(MediaType.APPLICATION_JSON).headers(headers).accept(MediaType.APPLICATION_JSON).get(CustomerEntries.class);
        List<com.deltek.maconomy.customerentry.Record> records = customerEntries.getPanes().getFilter().getRecords();
        if(records.size() >=1){
            StringBuilder sb = new StringBuilder();
            for(com.deltek.maconomy.customerentry.Record r: records){
                com.deltek.maconomy.customerentry.Data data = r.getData();
                if(data.getEntrytype().equalsIgnoreCase("credit_general_journal")){
                    if(fromDate.isEmpty() && data.getEntrydate().equalsIgnoreCase(toDate)){
                        Integer creditBase = data.getCreditbase()/100;
                        sb.append("You have received " + creditBase.toString() + " dollars from " + data.getName1() + ". ");
                    }else if(!fromDate.isEmpty()){ // fromDate <= entry date <= toDate
                        LocalDate entryDate = getLocalDate(data.getEntrydate());
                        LocalDate dateFrom = getLocalDate(fromDate);
                        LocalDate dateTo = getLocalDate(toDate);
                        if(entryDate != null && dateFrom != null && dateTo != null &&
                            ((entryDate.isEqual(dateFrom) || entryDate.isAfter(dateFrom)) && (dateTo.isEqual(entryDate) || dateTo.isAfter(entryDate)))){
                            Integer creditBase = data.getCreditbase()/100;
                            sb.append("You have received " + creditBase.toString() + " dollars from " + data.getName1() + ". ");
                        }
                    }
                }
            }
            return sb.toString();
        }else{
            return "";
        }
    }

    public static String getInvoicesDue(){
        ClientConfig configuration = new ClientConfig();
        configuration.register(CustomerEntries.class);
        configuration.register(JacksonJsonProvider.class);

        Client client = ClientBuilder.newClient(configuration);
        String queryParams = "duedate" + encodeValue("<date(2017,7,25)") + encodeValue(" and ") +"duedate" + encodeValue(">date(2017,1,1)") + encodeValue(" and ") + "entrytype=" + encodeValue("CustomerEntryTypeType'Invoice");
        String getUrl = BASE_API_PATH_AR + queryParams;

        log.info("sending request to url: {}", getUrl);

        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        ArrayList<Object> auth = new ArrayList<Object>();
        auth.add(AUTH_HEADER);
        headers.put("Authorization", auth);

        CustomerEntries customerEntries = client.target(getUrl).request(MediaType.APPLICATION_JSON).headers(headers).accept(MediaType.APPLICATION_JSON).get(CustomerEntries.class);
        List<com.deltek.maconomy.customerentry.Record> records = customerEntries.getPanes().getFilter().getRecords();

        if(records.size() >=1){
            Integer invoicesSize = records.size();
            StringBuilder sb = new StringBuilder();
            sb.append("I found " + invoicesSize.toString() + " invoices due for more than 90 days for this year. ");
            for(com.deltek.maconomy.customerentry.Record r: records){
                com.deltek.maconomy.customerentry.Data data = r.getData();
                Integer debitBase = data.getDebitbase()/100;
                String name1 = data.getName1();
                sb.append(name1 + " owes you " + debitBase + " dollars. ");
            }
            return sb.toString();
        }else{
            return "";
        }
    }

    private static String encodeValue(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        }catch (UnsupportedEncodingException e){
            log.error("Unable to encode {} to UTF8", value);
            return "";
        }
    }

    private static LocalDate getLocalDate(String date){
        LocalDate localDate = null;
        try{
            localDate = LocalDate.parse(date, DateTimeFormatter.ISO_LOCAL_DATE);
        }catch(DateTimeParseException e){
            log.error("Unable to parse date {} to local date", date);
        }
        return localDate;
    }

    /**
     * This method will make a request to the Device Address API path for retrieving the full address.
     * @return JsonNode the JSON response from the API.
     * @throws DeviceAddressClientException When the client fails to perform or complete the request
     *
    public Address getFullAddress() throws DeviceAddressClientException {
        CloseableHttpClient closeableHttpClient = HttpClients.createDefault();

        String requestUrl = apiEndpoint + BASE_API_PATH + deviceId + SETTINGS_PATH + FULL_ADDRESS_PATH;
        log.info("Request will be made to the following URL: {}", requestUrl);

        HttpGet httpGet = new HttpGet(requestUrl);

        httpGet.addHeader("Authorization", "Bearer " + consentToken);

        log.info("Sending request to Device Address API");
        Address address;
        try {
            HttpResponse addressResponse = closeableHttpClient.execute(httpGet);
            int statusCode = addressResponse.getStatusLine().getStatusCode();

            log.info("The Device Address API responded with a status code of {}", statusCode);

            if (statusCode == HttpStatus.SC_OK) {
                HttpEntity httpEntity = addressResponse.getEntity();
                String responseBody = EntityUtils.toString(httpEntity);

                ObjectMapper objectMapper = new ObjectMapper();
                address = objectMapper.readValue(responseBody, Address.class);
            } else if (statusCode == HttpStatus.SC_FORBIDDEN) {
                log.info("Failed to authorize with a status code of {}", statusCode);
                throw new UnauthorizedException("Failed to authorize.");
            } else {
                String errorMessage = "Device Address API query failed with status code of " + statusCode;
                log.info(errorMessage);
                throw new DeviceAddressClientException(errorMessage);
            }
        }  catch (IOException e) {
            throw new DeviceAddressClientException(e);
        } finally {
            log.info("Request to Address Device API completed.");
        }

        return address;
    }
    */
}
