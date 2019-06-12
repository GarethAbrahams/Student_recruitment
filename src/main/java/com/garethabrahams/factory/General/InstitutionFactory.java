package com.garethabrahams.factory.General;

import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.General.Institution;

public class InstitutionFactory {

    public static Institution createInstitution(String institutionName, ApplicantCity city){
        return new Institution.Builder()
                .institutionName(institutionName)
                .institutionCity(city)
                .build();
    }
}
