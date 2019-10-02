package com.garethabrahams.factory.bridge;

import com.garethabrahams.model.bridge.ApplicantUserDetails;

public class ApplicantUserDetailsFactory {

    public static ApplicantUserDetails createApplicantUserDetails(String appID, String username){
        return new ApplicantUserDetails.Builder()
                .applicantID(appID)
                .username(username)
                .build();
    }
}
