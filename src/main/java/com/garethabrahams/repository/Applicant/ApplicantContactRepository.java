package com.garethabrahams.repository.Applicant;

import com.garethabrahams.model.Applicant.ApplicantContact;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantContactRepository extends IRepository<ApplicantContact,String> {
    Set<ApplicantContact> getAll();
}
