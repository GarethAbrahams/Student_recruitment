package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.ApplicantEmail;

public class ApplicantEmailFactory {
    public static ApplicantEmail createApplicantEmail(String email){
        return new ApplicantEmail.Builder()
                .email(email)
                .build();
    }
}
