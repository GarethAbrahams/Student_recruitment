package com.garethabrahams.factory.bridge;

import com.garethabrahams.model.bridge.ApplicantContact;

public class ApplicantContactFactory {

    public static ApplicantContact createApplicantContact(String appID, String contactID){
        return new ApplicantContact.Builder()
                .applicantID(appID)
                .contactID(contactID)
                .build();
    }
}
