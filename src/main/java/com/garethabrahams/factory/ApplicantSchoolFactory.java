package com.garethabrahams.factory;

import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.ApplicantSchool;

public class ApplicantSchoolFactory {

    public static ApplicantSchool createSchool(String schoolName, String area, String province, String yearMatric, ApplicantCity city){
        return new ApplicantSchool.Builder()
                .schoolName(schoolName)
                .area(area)
                .province(province)
                .yearMatric(yearMatric)
                .city(city)
                .build();
    }

}
