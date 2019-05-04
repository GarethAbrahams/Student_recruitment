package com.garethabrahams.factory;

import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.ApplicantAddress;

public class ApplicatantAddressFactory {

    public static ApplicantAddress createApplicatantAddress(String address, String suburb ,ApplicantCity city){
        return new ApplicantAddress.Builder()
                .address(address)
                .suburb(suburb)
                .city(city)
                .build();
    }
}
