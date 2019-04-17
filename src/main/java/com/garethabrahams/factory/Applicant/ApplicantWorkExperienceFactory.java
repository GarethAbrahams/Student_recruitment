package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.ApplicantWorkExperience;

public class ApplicantWorkExperienceFactory {

    public static ApplicantWorkExperience createWorkExperience(String company, String area, String yearAtCompany, String role){
        return new ApplicantWorkExperience.Builder()
                .company(company)
                .area(area)
                .yearAtCompany(yearAtCompany)
                .role(role)
                .build();
    }
}
