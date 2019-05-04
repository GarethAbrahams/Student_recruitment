package com.garethabrahams.factory;

import com.garethabrahams.model.ApplicantEmail;

public class ApplicantEmailFactory {
    public static ApplicantEmail createApplicantEmail(String email){
        return new ApplicantEmail.Builder()
                .email(email)
                .build();
    }
}
