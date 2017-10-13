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
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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

    private static final String BASE_API_PATH = "https://fti-bld.deltekenterprise.com/containers/v1/bldfti/dailytimeregistration/data;any";
    /*
    private static final String SETTINGS_PATH = "/settings/";
    private static final String FULL_ADDRESS_PATH = "address";
    private static final String COUNTRY_AND_POSTAL_CODE_PATH = "address/countryAndPostalCode";
    */

    public static String getDailyTime(String employeeNumberVar, String dateVar, Integer hours){
        ClientConfig configuration = new ClientConfig();
        configuration.register(DailyTimeRegistration.class);
        configuration.register(JacksonJsonProvider.class);

        Client client = ClientBuilder.newClient(configuration);
        String queryParams = "?card.employeenumbervar=" + employeeNumberVar + "&card.datevar=" + dateVar;
        String getUrl = BASE_API_PATH + queryParams;

        MultivaluedMap<String, Object> headers = new MultivaluedHashMap<>();
        ArrayList<Object> auth = new ArrayList<Object>();
        auth.add("Basic c3lzYWRtaW46aCg2UTM2IVM3RjcwKGk=");
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

            String postUrl = BASE_API_PATH + "/table" + queryParams;
            Data data = new Data();
            data.setJobnumber("1040010");
            data.setTaskname("TM");
            data.setNumberof(hours);
            Record table = new Record();
            table.setData(data);
            Response response = client.target(postUrl).request(MediaType.APPLICATION_JSON).headers(headers).accept(MediaType.APPLICATION_JSON).post(Entity.entity(table, MediaType.APPLICATION_JSON));
            return response.getStatusInfo().toString();
            //Data_ data = record.getData();
            //return data.getEmployeenamevar();
        }
        return "";
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
