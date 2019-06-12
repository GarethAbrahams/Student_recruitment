package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.StaffCity;

public class StaffCityFactory {
    public static StaffCity createStaffCity(String city){
        return new StaffCity.Builder()
                .city(city)
                .build();
    }
}
