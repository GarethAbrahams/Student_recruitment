package com.garethabrahams.factory.bridge;

import com.garethabrahams.model.bridge.ApplicantWorkExperience;

public class ApplicantWorkExperienceFactory {

    public static ApplicantWorkExperience createApplicantWorkExperience(String appID, String workID){
        return new ApplicantWorkExperience.Builder()
                .applicantID(appID)
                .workID(workID)
                .build();
    }
}
