package com.garethabrahams.factory;

import com.garethabrahams.model.ApplicantContact;

public class ApplicantContactFactory {

    public static ApplicantContact createApplicantContact(String phone, String cellphone){
        return new ApplicantContact.Builder()
                .phone(phone)
                .cellphone(cellphone)
                .build();
    }
}
