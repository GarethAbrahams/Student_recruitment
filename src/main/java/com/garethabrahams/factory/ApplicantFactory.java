package com.garethabrahams.factory;

import com.garethabrahams.model.Applicant;
import com.garethabrahams.util.IDGenerator;

public class ApplicantFactory {

    public static Applicant createApplicant(String name, String last, String idNum){
        String id = IDGenerator.generateID();

        return new Applicant.Builder()
                .applicantID(id)
                .name(name)
                .surname(last)
                .idNum(idNum)
                .build();
    }

}
