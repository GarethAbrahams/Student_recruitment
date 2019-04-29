package com.garethabrahams.factory.Institution;

import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Institution.Institution;

public class InstitutionFactory {

    public static Institution createInstitution(String institutionName, ApplicantCity city){
        return new Institution.Builder()
                .institutionName(institutionName)
                .institutionCity(city)
                .build();
    }
}
