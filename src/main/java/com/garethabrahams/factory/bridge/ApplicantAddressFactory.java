package com.garethabrahams.factory.bridge;

import com.garethabrahams.model.bridge.ApplicantAddress;

public class ApplicantAddressFactory {

    public static ApplicantAddress createApplicantAddress(String appID, String addressID){
        return new ApplicantAddress.Builder()
                .applicantID(appID)
                .addressID(addressID)
                .build();
    }
}
