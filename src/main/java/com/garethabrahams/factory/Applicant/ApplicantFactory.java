package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.Applicant;
import com.garethabrahams.model.Applicant.ApplicantContact;
import com.garethabrahams.model.Applicant.ApplicantEmail;
import com.garethabrahams.model.Applicant.ApplicantAddress;

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
