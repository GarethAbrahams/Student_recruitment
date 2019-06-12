package com.garethabrahams.repository.Applicant;

import com.garethabrahams.model.Applicant.ApplicantEmail;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantEmailRepository extends IRepository<ApplicantEmail, String> {
    Set<ApplicantEmail> getAll();
}
