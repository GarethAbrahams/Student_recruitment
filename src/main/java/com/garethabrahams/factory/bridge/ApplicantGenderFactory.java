package com.garethabrahams.factory.bridge;

import com.garethabrahams.model.bridge.ApplicantGender;

public class ApplicantGenderFactory {

    public static ApplicantGender createApplicantGender(String appID, String genderID){
        return new ApplicantGender.Builder()
                .applicantID(appID)
                .genderID(genderID)
                .build();
    }
}
