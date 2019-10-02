package com.garethabrahams.factory.bridge;

import com.garethabrahams.model.bridge.ApplicantQualification;

public class ApplicantQualificationFactory {

    public static ApplicantQualification createApplicantQualification(String appID, String qualID){
        return new ApplicantQualification.Builder()
                .applicantID(appID)
                .qualificationID(qualID)
                .build();
    }
}
