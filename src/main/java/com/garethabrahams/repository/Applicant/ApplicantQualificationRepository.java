package com.garethabrahams.repository.Applicant;

import com.garethabrahams.model.Applicant.ApplicantQualification;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantQualificationRepository extends IRepository<ApplicantQualification, String> {
    Set<ApplicantQualification> getAll();
}
