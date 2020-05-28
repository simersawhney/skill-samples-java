package com.deltek.maconomy.ask.handlers;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Intent;
import com.amazon.ask.model.IntentRequest;
import com.amazon.ask.model.Request;
import com.amazon.ask.model.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.deltek.maconomy.dailytime.WebServiceClient;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class InvoicesDueIntentHandler implements RequestHandler {
    private static final Logger log = LoggerFactory.getLogger(ExpenseIntentHandler.class);

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(intentName("InvoicesDueIntent"));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        Request request = input.getRequestEnvelope().getRequest();
        IntentRequest intentRequest = (IntentRequest) request;
        Intent intent = intentRequest.getIntent();

        String result = WebServiceClient.getInvoicesDue();
        log.info("getInvoicesDue result ={}", result);

        String speechText = result.isEmpty()?"Sorry, I was unable to find any invoices due for more than 90 days": result;

        String repromptText = "You can ask me to tell you the invoices due for more than ninety days";

        return input.getResponseBuilder()
            .withSimpleCard("InvoicesDue", speechText)
            .withSpeech(speechText)
            .withReprompt(repromptText)
            .withShouldEndSession(false)
            .build();
    }


}
