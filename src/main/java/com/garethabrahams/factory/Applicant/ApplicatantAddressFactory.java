package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Applicant.ApplicantAddress;

public class ApplicatantAddressFactory {

    public static ApplicantAddress createApplicatantAddress(String address, String suburb ,ApplicantCity city){
        return new ApplicantAddress.Builder()
                .address(address)
                .suburb(suburb)
                .city(city)
                .build();
    }
}
