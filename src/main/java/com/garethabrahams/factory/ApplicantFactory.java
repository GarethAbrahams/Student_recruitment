package com.garethabrahams.factory;

import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.ApplicantContact;
import com.garethabrahams.model.ApplicantEmail;
import com.garethabrahams.model.ApplicantAddress;

public class ApplicantFactory {

    public static Applicant createApplicant(String name, String surname, String id, ApplicantAddress address, ApplicantContact contact, ApplicantEmail email){
        return new Applicant.Builder()
                .name(name)
                .surname(surname)
                .id(id)
                .address(address)
                .contact(contact)
                .email(email)
                .build();
    }
}
