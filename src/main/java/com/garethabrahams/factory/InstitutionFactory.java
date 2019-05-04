package com.garethabrahams.factory;

import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.Institution;

public class InstitutionFactory {

    public static Institution createInstitution(String institutionName, ApplicantCity city){
        return new Institution.Builder()
                .institutionName(institutionName)
                .institutionCity(city)
                .build();
    }
}
