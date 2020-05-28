/*
     Copyright 2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
     Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file
     except in compliance with the License. A copy of the License is located at
         http://aws.amazon.com/apache2.0/
     or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for
     the specific language governing permissions and limitations under the License.
*/

package com.deltek.maconomy.ask;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.deltek.maconomy.ask.handlers.HelpIntentHandler;
import com.deltek.maconomy.ask.handlers.LaunchRequestHandler;
import com.deltek.maconomy.ask.handlers.SessionEndedRequestHandler;
import com.deltek.maconomy.ask.handlers.CancelandStopIntentHandler;
import com.deltek.maconomy.ask.handlers.DailyTimeIntentHandler;
import com.deltek.maconomy.ask.handlers.ExpenseIntentHandler;
import com.deltek.maconomy.ask.handlers.CashReceiptsIntentHandler;
import com.deltek.maconomy.ask.handlers.InvoicesDueIntentHandler;
import com.deltek.maconomy.ask.handlers.FallbackIntentHandler;

public class DailyTimeStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
            .addRequestHandlers(
                new DailyTimeIntentHandler(),
                new ExpenseIntentHandler(),
                new CashReceiptsIntentHandler(),
                new InvoicesDueIntentHandler(),
                new LaunchRequestHandler(),
                new CancelandStopIntentHandler(),
                new SessionEndedRequestHandler(),
                new HelpIntentHandler(),
                new FallbackIntentHandler())
            // Add your skill id below
            //.withSkillId("")
            .build();
    }

    public DailyTimeStreamHandler() {
        super(getSkill());
    }

}