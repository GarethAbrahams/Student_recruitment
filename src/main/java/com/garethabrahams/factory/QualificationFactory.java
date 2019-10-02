package com.garethabrahams.factory;

import com.garethabrahams.model.Qualification;
import com.garethabrahams.util.IDGenerator;

public class QualificationFactory {

    public static Qualification createQualification(String qualificationName, String yearObtained, String placeObtained){
        String id = IDGenerator.generateID();

        return new Qualification.Builder()
                .qualificationID(id)
                .qualificationName(qualificationName)
                .yearObtained(yearObtained)
                .placeObtained(placeObtained)
                .build();
    }
}
