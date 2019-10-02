package com.garethabrahams.factory.bridge;

import com.garethabrahams.model.bridge.ApplicantRole;

public class ApplicantRoleFactory {

    public static ApplicantRole createApplicantRole(String appID, String roleID){
        return new ApplicantRole.Builder()
                .applicantID(appID)
                .roleID(roleID)
                .build();
    }
}
