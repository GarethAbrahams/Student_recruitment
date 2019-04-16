package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.Region;

public class RegionFactory {

    public static Region createRegion(String city){
        return new Region.Builder()
                .city(city)
                .build();
    }
}
