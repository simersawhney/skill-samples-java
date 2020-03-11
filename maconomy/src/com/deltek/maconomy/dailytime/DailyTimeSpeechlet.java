/**
    Copyright 2014-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.

    Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with the License. A copy of the License is located at

        http://aws.amazon.com/apache2.0/

    or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 */
package com.deltek.maconomy.dailytime;

import com.amazon.speech.slu.Slot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazon.speech.slu.Intent;
import com.amazon.speech.speechlet.IntentRequest;
import com.amazon.speech.speechlet.LaunchRequest;
import com.amazon.speech.speechlet.Session;
import com.amazon.speech.speechlet.SessionEndedRequest;
import com.amazon.speech.speechlet.SessionStartedRequest;
import com.amazon.speech.speechlet.Speechlet;
import com.amazon.speech.speechlet.SpeechletException;
import com.amazon.speech.speechlet.SpeechletResponse;
import com.amazon.speech.ui.PlainTextOutputSpeech;
import com.amazon.speech.ui.Reprompt;
import com.amazon.speech.ui.SimpleCard;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * This sample shows how to create a simple speechlet for handling speechlet requests.
 */
public class DailyTimeSpeechlet implements Speechlet {
    private static final Logger log = LoggerFactory.getLogger(DailyTimeSpeechlet.class);

    /**
     * Constant defining attribute key for the intent slot key.
     */
    private static final String SLOT_HOUR = "hourValue";
    private static final String SLOT_DIST = "mileValue";
    private static final String SLOT_DATE = "dateValue";

    @Override
    public void onSessionStarted(final SessionStartedRequest request, final Session session)
            throws SpeechletException {
        log.info("onSessionStarted requestId={}, sessionId={}", request.getRequestId(),
                session.getSessionId());
        // any initialization logic goes here
    }

    @Override
    public SpeechletResponse onLaunch(final LaunchRequest request, final Session session)
            throws SpeechletException {
        log.info("onLaunch requestId={}, sessionId={}", request.getRequestId(),
                session.getSessionId());
        return getWelcomeResponse();
    }

    @Override
    public SpeechletResponse onIntent(final IntentRequest request, final Session session)
            throws SpeechletException {
        log.info("onIntent requestId={}, sessionId={}", request.getRequestId(),
                session.getSessionId());

        Intent intent = request.getIntent();
        String intentName = (intent != null) ? intent.getName() : null;

        if ("DailyTimeIntent".equals(intentName)) {
            return insertDailyTime(intent);
        } else if ("ExpenseIntent".equals(intentName)) {
            return insertExpense(intent);
        } else if ("CashReceiptsIntent".equals(intentName)) {
            return getCashReceipts(intent);
        } else if ("InvoicesDueIntent".equals(intentName)) {
            return getInvoicesDue(intent);
        } else if ("AMAZON.HelpIntent".equals(intentName)) {
            return getHelpResponse();
        } else if ("AMAZON.StopIntent".equals(intentName)) {
            return getExitResponse();
        }else if ("AMAZON.CancelIntent".equals(intentName)) {
            return getExitResponse();
        }else {
            throw new SpeechletException("Invalid Intent");
        }
    }

    @Override
    public void onSessionEnded(final SessionEndedRequest request, final Session session)
            throws SpeechletException {
        log.info("onSessionEnded requestId={}, sessionId={}", request.getRequestId(),
                session.getSessionId());
        // any cleanup logic goes here
    }

    /**
     * Creates and returns a {@code SpeechletResponse} with a welcome message.
     *
     * @return SpeechletResponse spoken and visual response for the given intent
     */
    private SpeechletResponse getWelcomeResponse() {
        String speechText = "Welcome to the Maconomy Alexa Skill, you can register hours or mileage on a job";

        // Create the Simple card content.
        SimpleCard card = new SimpleCard();
        card.setTitle("DailyTime");
        card.setContent(speechText);

        // Create the plain text output.
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(speechText);

        // Create reprompt
        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(speech);

        return SpeechletResponse.newAskResponse(speech, reprompt, card);
    }

    /**
     * Creates a {@code SpeechletResponse} for the DailyTime intent.
     *
     * @return SpeechletResponse spoken and visual response for the given intent
     */
    private SpeechletResponse insertDailyTime(Intent intent) {
        Double hours = getHours(intent);
        log.info("received {} hours", hours);
        String dateVar = getDate(intent);
        log.info("received date {}", dateVar);

        String jobNumber = "10001";//"1040010";
        String taskName = "100";//"TM";
        String employeeNumber = "150-109";//"23035";
        String status = WebServiceClient.insertDailyTime(employeeNumber, dateVar, hours, jobNumber, taskName);
        log.info("insertDailyTime request status={}", status);
        StringBuilder sb = new StringBuilder();
        if(status.equalsIgnoreCase("OK")){
            sb.append("Great, I was able to register the time you requested. You can login to Maconomy to view your updated timesheet.");
        }else{
            sb.append("Sorry, something went wrong. I was unable to register the time you requested.");
        }
        String speechText = sb.toString();

        // Create the Simple card content.
        SimpleCard card = new SimpleCard();
        card.setTitle("DailyTime");
        card.setContent(speechText);

        // Create the plain text output.
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(speechText);

        return SpeechletResponse.newTellResponse(speech, card);
    }

    /**
     * Creates a {@code SpeechletResponse} for the Expense intent.
     *
     * @return SpeechletResponse spoken and visual response for the given intent
     */
    private SpeechletResponse insertExpense(Intent intent) {
        Integer miles = getMiles(intent);
        log.info("received {} miles", miles);

        String expenseSheetNumber = "850091";//"1700000";
        String jobNumber = "10001";
        String taskName = "400";//"Travel Expenses";
        String jobNum = WebServiceClient.insertExpense(expenseSheetNumber, jobNumber, taskName, miles.doubleValue());
        log.info("insertExpense request jobNumber={}", jobNumber);
        StringBuilder sb = new StringBuilder();
        if(!jobNumber.isEmpty()){
            sb.append(miles.toString() + " miles have been recorded on your current expense sheet for job " + jobNumber + " for Vandalay industries");
        }else{
            sb.append("Sorry, something went wrong. I was unable to register the expense you requested.");
        }
        String speechText = sb.toString();

        // Create the Simple card content.
        SimpleCard card = new SimpleCard();
        card.setTitle("Expense");
        card.setContent(speechText);

        // Create the plain text output.
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(speechText);

        return SpeechletResponse.newTellResponse(speech, card);
    }

    /**
     * Creates a {@code SpeechletResponse} for the CashReceipts intent.
     *
     * @return SpeechletResponse spoken and visual response for the given intent
     */
    private SpeechletResponse getCashReceipts(Intent intent) {
        String toDate = getDate(intent);
        log.info("received toDate {}", toDate);

        String fromDate = getFromDate(intent);
        log.info("received fromDate {}", fromDate);

        String customerNumber = "110076";//"110060";
        String result = WebServiceClient.getCashReceipts(customerNumber, toDate, fromDate);
        log.info("getCashReceipts result ={}", result);

        String speechText = result.isEmpty()?"Sorry, I was unable to find any cash receipts": result;

        // Create the Simple card content.
        SimpleCard card = new SimpleCard();
        card.setTitle("CashReceipts");
        card.setContent(speechText);

        // Create the plain text output.
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(speechText);

        return SpeechletResponse.newTellResponse(speech, card);
    }

    /**
     * Creates a {@code SpeechletResponse} for the CashReceipts intent.
     *
     * @return SpeechletResponse spoken and visual response for the given intent
     */
    private SpeechletResponse getInvoicesDue(Intent intent) {
        String result = WebServiceClient.getInvoicesDue();
        log.info("getInvoicesDue result ={}", result);

        String speechText = result.isEmpty()?"Sorry, I was unable to find any invoices due for more than 90 days": result;

        // Create the Simple card content.
        SimpleCard card = new SimpleCard();
        card.setTitle("InvoicesDue");
        card.setContent(speechText);

        // Create the plain text output.
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(speechText);

        return SpeechletResponse.newTellResponse(speech, card);
    }

    /**
     * Creates a {@code SpeechletResponse} for the help intent.
     *
     * @return SpeechletResponse spoken and visual response for the given intent
     */
    private SpeechletResponse getHelpResponse() {
        String speechText = "You can ask Maconomy to register 5 hours for October twentieth";

        // Create the Simple card content.
        SimpleCard card = new SimpleCard();
        card.setTitle("DailyTime");
        card.setContent(speechText);

        // Create the plain text output.
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(speechText);

        // Create reprompt
        Reprompt reprompt = new Reprompt();
        reprompt.setOutputSpeech(speech);

        return SpeechletResponse.newAskResponse(speech, reprompt, card);
    }

    /**
     * Creates a {@code SpeechletResponse} for the stop intent.
     *
     * @return SpeechletResponse spoken and visual response for the given intent
     */
    private SpeechletResponse getExitResponse() {
        String speechText = "Goodbye";

        // Create the Simple card content.
        SimpleCard card = new SimpleCard();
        card.setTitle("DailyTime");
        card.setContent(speechText);

        // Create the plain text output.
        PlainTextOutputSpeech speech = new PlainTextOutputSpeech();
        speech.setText(speechText);

        return SpeechletResponse.newTellResponse(speech, card);
    }

    /**
     * Function to accept an intent containing a Day slot (date object) and return the String
     * representation of that slot value. If the user provides a date, then use that, otherwise use
     * today.
     *
     * @param intent
     *            the intent object containing the day slot
     * @return the Calendar representation of that date
     */
    private String getDate(Intent intent) {
        Slot daySlot = intent.getSlot(SLOT_DATE);
        LocalDate date;
        if (daySlot != null && daySlot.getValue() != null) {
            String slotValue = daySlot.getValue();
            try {
                date = LocalDate.parse(slotValue, DateTimeFormatter.ISO_LOCAL_DATE);
            } catch (DateTimeParseException e) {
                log.error("Unable to parse slotValue {} to date", slotValue);
                log.error(e.getMessage());
                date = LocalDate.now();
            }
        } else {
            date = LocalDate.now();
        }
        return date.toString();
    }

    private String getFromDate(Intent intent){
        Slot dateSlot = intent.getSlot(SLOT_DATE);
        LocalDate date;
        if (dateSlot != null && dateSlot.getValue() != null) {
            String slotValue = dateSlot.getValue();
            if(slotValue.matches("\\d{4}-W\\d{2}")){
                try {
                    date = LocalDate.parse(slotValue+"-1", DateTimeFormatter.ISO_WEEK_DATE);
                    return date.toString();
                }catch (DateTimeParseException e){
                    log.error("Unable to parse slotValue {} to date", slotValue);
                    log.error(e.getMessage());
                    return "";
                }
            }else{
                return "";
            }
        }else{
            return "";
        }
    }

    private Double getHours(Intent intent){
        Slot hourSlot = intent.getSlot(SLOT_HOUR);
        String hours = "PT0H";
        if(hourSlot != null && hourSlot.getValue() != null){
            try {
                hours = hourSlot.getValue();
            } catch (NumberFormatException e){
                hours = "PT0H";
            }
        }else{
            hours = "PT0H";
        }
        log.info("obtained following slot value for hours from intent:{}", hours);

        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        Double hoursDouble = 0.0;
        try {
            Duration duration = Duration.parse(hours);
            Long minutes = duration.toMinutes();
            Double minutesDouble = minutes.doubleValue();
            hoursDouble = Double.parseDouble(decimalFormat.format(minutesDouble/60));
        }catch (Exception e){
            log.error("Could not convert hours to double: " + e.getMessage());
        }
        return hoursDouble;
    }

    private Integer getMiles(Intent intent){
        Slot mileSlot = intent.getSlot(SLOT_DIST);
        Integer miles = 50;
        if(mileSlot != null && mileSlot.getValue() != null){
            String slotValue = mileSlot.getValue();
            log.info("obtained following slot value for miles from intent:{}", slotValue);
            Integer mileValue = getMileValue(slotValue.replaceAll("(\\w+)(\\s+)(\\d).*", "$3"));
            if(mileValue == 0){
                switch (slotValue){
                    case "five": miles = 5;
                        break;
                    case "ten": miles = 10;
                        break;
                    case "fifteen": miles = 15;
                        break;
                    case "twenty": miles = 20;
                        break;
                    case "twenty five": miles = 25;
                        break;
                    case "thirty": miles = 30;
                        break;
                    case "thirty five": miles = 35;
                        break;
                    case "forty": miles = 40;
                        break;
                    case "forty five": miles = 45;
                        break;
                    case "fifty": miles = 50;
                        break;
                    default: miles = 50;
                        break;
                }
            }else{
                miles = mileValue;
            }
        }
        return miles;
    }

    private Integer getMileValue(String slotValue){
        Integer miles = 0;
        try {
            miles = Integer.parseInt(slotValue);
        }catch (NumberFormatException e){
            log.error("Unable to parse mileValue {} to int", slotValue);
            log.error(e.getMessage());
        }
        return miles;
    }
}
