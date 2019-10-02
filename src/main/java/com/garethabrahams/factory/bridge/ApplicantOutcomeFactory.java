package com.garethabrahams.factory.bridge;

import com.garethabrahams.model.bridge.ApplicantOutcome;

public class ApplicantOutcomeFactory {

    public static ApplicantOutcome createApplicantOutcome(String appID, String outcomeID){
        return new ApplicantOutcome.Builder()
                .applicantID(appID)
                .outcomeID(outcomeID)
                .build();
    }
}
