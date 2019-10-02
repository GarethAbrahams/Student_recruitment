package com.garethabrahams.factory.bridge;

import com.garethabrahams.model.bridge.ApplicantEmail;

public class ApplicantEmailFactory {

    public static ApplicantEmail createApplicantEmail(String appID, String emailID){
        return new ApplicantEmail.Builder()
                .applicantID(appID)
                .emailID(emailID)
                .build();
    }
}
