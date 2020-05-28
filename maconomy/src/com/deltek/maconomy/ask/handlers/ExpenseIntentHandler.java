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

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class ExpenseIntentHandler implements RequestHandler {
    private static final Logger log = LoggerFactory.getLogger(ExpenseIntentHandler.class);
    private static final String SLOT_DIST = "mileValue";

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("ExpenseIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        Request request = input.getRequestEnvelope().getRequest();
        IntentRequest intentRequest = (IntentRequest) request;
        Intent intent = intentRequest.getIntent();

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

        String repromptText = "You can ask me to record five miles to your expense sheet for the Vandalay Industries job";

        return input.getResponseBuilder()
            .withSimpleCard("Expense", speechText)
            .withSpeech(speechText)
            .withReprompt(repromptText)
            .withShouldEndSession(false)
            .build();
    }

    private Integer getMiles(Intent intent){
        Map<String, Slot> slots = intent.getSlots();
        Slot mileSlot = slots.get(SLOT_DIST);
        //Slot mileSlot = intent.getSlot(SLOT_DIST);
        Integer miles = 50;
        if(mileSlot != null
            && mileSlot.getResolutions() != null
            && mileSlot.getResolutions().toString().contains("ER_SUCCESS_MATCH")){
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