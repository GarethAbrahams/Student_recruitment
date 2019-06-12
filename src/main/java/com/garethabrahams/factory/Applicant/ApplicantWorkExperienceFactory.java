package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Applicant.ApplicantWorkExperience;

public class ApplicantWorkExperienceFactory {

    public static ApplicantWorkExperience createWorkExperience(String company, String area, String yearAtCompany, String role, ApplicantCity city){
        return new ApplicantWorkExperience.Builder()
                .company(company)
                .area(area)
                .yearAtCompany(yearAtCompany)
                .role(role)
                .city(city)
                .build();
    }
}
