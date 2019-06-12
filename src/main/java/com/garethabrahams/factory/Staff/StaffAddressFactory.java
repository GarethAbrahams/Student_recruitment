package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.StaffAddress;
import com.garethabrahams.model.Staff.StaffCity;

public class StaffAddressFactory {
    public static StaffAddress createStaffAddress(String address, String suburb, StaffCity city){
        return new StaffAddress.Builder()
                .address(address)
                .suburb(suburb)
                .city(city)
                .build();
    }
}
