package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.ApplicantContact;

public class ApplicantContactFactory {

    public static ApplicantContact createApplicantContact(String phone, String cellphone){
        return new ApplicantContact.Builder()
                .phone(phone)
                .cellphone(cellphone)
                .build();
    }
}
