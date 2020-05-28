package com.deltek.maconomy.ask.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Intent;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Request;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.Slot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deltek.maconomy.dailytime.WebServiceClient;

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

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class CashReceiptsIntentHandler implements RequestHandler {
    private static final Logger log = LoggerFactory.getLogger(ExpenseIntentHandler.class);
    private static final String SLOT_DATE = "dateValue";

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("CashReceiptsIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        Request request = input.getRequestEnvelope().getRequest();
        IntentRequest intentRequest = (IntentRequest) request;
        Intent intent = intentRequest.getIntent();

        String toDate = getDate(intent);
        log.info("received toDate {}", toDate);

        String fromDate = getFromDate(intent);
        log.info("received fromDate {}", fromDate);

        String customerNumber = "110076";//"110060";
        String result = WebServiceClient.getCashReceipts(customerNumber, toDate, fromDate);
        log.info("getCashReceipts result ={}", result);

        String speechText = result.isEmpty()?"Sorry, I was unable to find any cash receipts": result;

        String repromptText = "You can ask me if you received any cash today";

        return input.getResponseBuilder()
            .withSimpleCard("CashReceipts", speechText)
            .withSpeech(speechText)
            .withReprompt(repromptText)
            .withShouldEndSession(false)
            .build();

    }

    private String getDate(Intent intent) {
        Map<String, Slot> slots = intent.getSlots();
        Slot daySlot = slots.get(SLOT_DATE);
        //Slot daySlot = intent.getSlot(SLOT_DATE);
        LocalDate date;
        if (daySlot != null
            && daySlot.getResolutions() != null
            && daySlot.getResolutions().toString().contains("ER_SUCCESS_MATCH")) {
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
        Map<String, Slot> slots = intent.getSlots();
        Slot dateSlot = slots.get(SLOT_DATE);
        LocalDate date;
        if (dateSlot != null
            && dateSlot.getResolutions() != null
            && dateSlot.getResolutions().toString().contains("ER_SUCCESS_MATCH")) {
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
}