package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.ApplicantSchool;

public class ApplicantSchoolFactory {

    public static ApplicantSchool createSchool(String schoolName, String area, String province, String yearMatric){
        return new ApplicantSchool.Builder()
                .schoolName(schoolName)
                .area(area)
                .province(province)
                .yearMatric(yearMatric)
                .build();
    }

}
