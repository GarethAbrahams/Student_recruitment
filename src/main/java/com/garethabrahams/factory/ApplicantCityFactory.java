package com.garethabrahams.factory;

import com.garethabrahams.model.ApplicantCity;

public class ApplicantCityFactory {
    public static ApplicantCity creatApplicantCity(String city) {
        return new ApplicantCity.Builder()
                .city(city)
                .build();
    }
}
