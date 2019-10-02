package com.garethabrahams.factory;

import com.garethabrahams.model.Outcome;
import com.garethabrahams.util.IDGenerator;

public class OutcomeFactory {

    public static Outcome createOutcome(String outcome){
        String id = IDGenerator.generateID();

        return new Outcome.Builder()
                .id(id)
                .result(outcome)
                .build();
    }
}
