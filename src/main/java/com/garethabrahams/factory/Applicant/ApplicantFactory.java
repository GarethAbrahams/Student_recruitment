package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.Applicant;

public class ApplicantFactory {

    public static Applicant createApplicant(String name, String surname, String id){
        return new Applicant.Builder()
                .name(name)
                .surname(surname)
                .id(id)
                .build();
    }
}
