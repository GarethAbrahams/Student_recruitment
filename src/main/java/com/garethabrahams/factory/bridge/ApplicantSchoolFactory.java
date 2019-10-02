package com.garethabrahams.factory.bridge;

import com.garethabrahams.model.bridge.ApplicantSchool;

public class ApplicantSchoolFactory {

    public static ApplicantSchool createApplicantSchool(String appID, String schoolID){
        return new ApplicantSchool.Builder()
                .applicantID(appID)
                .schoolID(schoolID)
                .build();
    }
}
