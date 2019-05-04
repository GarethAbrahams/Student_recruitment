package com.garethabrahams.factory;

import com.garethabrahams.model.StaffAddress;
import com.garethabrahams.model.StaffCity;

public class StaffAddressFactory {
    public static StaffAddress createStaffAddress(String address, String suburb, StaffCity city){
        return new StaffAddress.Builder()
                .address(address)
                .suburb(suburb)
                .city(city)
                .build();
    }
}
