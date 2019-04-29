package com.garethabrahams.repository;

import com.garethabrahams.model.Applicant.ApplicantContact;

import java.util.Set;

public interface ApplicantContactRepository extends IRepository<ApplicantContact,String>{
    Set<ApplicantContact> getAll();
}
