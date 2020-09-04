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

import com.deltek.maconomy.dailytime.WebServiceClient;
import static com.amazon.ask.request.Predicates.intentName;

public class DailyTimeIntentHandler implements RequestHandler {
    private static final Logger log = LoggerFactory.getLogger(DailyTimeIntentHandler.class);
    private static final String SLOT_HOUR = "hourValue";
    private static final String SLOT_DATE = "dateValue";
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("DailyTimeIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        Request request = input.getRequestEnvelope().getRequest();
        IntentRequest intentRequest = (IntentRequest) request;
        Intent intent = intentRequest.getIntent();

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

        String repromptText = "You can ask me to record four hours to your time sheet for the Vandalay industries audit job.";

        return input.getResponseBuilder()
            .withSimpleCard("DailyTime", speechText)
            .withSpeech(speechText)
            .withReprompt(repromptText)
            .withShouldEndSession(true)
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

    private Double getHours(Intent intent){
        Map<String, Slot> slots = intent.getSlots();
        Slot hourSlot = slots.get(SLOT_HOUR);
        //Slot hourSlot = intent.getSlot(SLOT_HOUR);
        String hours = hourSlot.getValue();
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

    private String getHoursSlot(Slot hourSlot) {
        if(hourSlot != null
            && hourSlot.getResolutions() != null
            && hourSlot.getResolutions().toString().contains("ER_SUCCESS_MATCH")){
            try {
                return hourSlot.getValue();
            } catch (NumberFormatException e){
                log.error("Error getting hour slot value: " + e.getMessage());
                return "PT0H";
            }
        }else{
            return "PT0H";
        }
    }
}