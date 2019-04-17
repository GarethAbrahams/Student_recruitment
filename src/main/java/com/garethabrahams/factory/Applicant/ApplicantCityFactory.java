package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.ApplicantCity;

public class ApplicantCityFactory {
    public static ApplicantCity creatStudentCity(String city) {
        return new ApplicantCity.Builder()
                .city(city)
                .build();
    }
}
