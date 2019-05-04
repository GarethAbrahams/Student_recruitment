package com.garethabrahams.factory;

import com.garethabrahams.model.StaffCity;

public class StaffCityFactory {
    public static StaffCity createStaffCity(String city){
        return new StaffCity.Builder()
                .city(city)
                .build();
    }
}
