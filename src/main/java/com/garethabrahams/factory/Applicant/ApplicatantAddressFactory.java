package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.ApplicatantAddress;

public class ApplicatantAddressFactory {

    public static ApplicatantAddress createApplicatantAddress(String address){
        return new ApplicatantAddress.Builder()
                .address(address)
                .build();
    }
}
