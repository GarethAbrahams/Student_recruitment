package com.garethabrahams.factory.Institution;

import com.garethabrahams.model.Institution.Institution;

public class InstitutionFactory {

    public static Institution createInstitution(String institutionName, String institutionLocation){
        return new Institution.Builder()
                .institutionName(institutionName)
                .institutionLocation(institutionLocation)
                .build();
    }
}
