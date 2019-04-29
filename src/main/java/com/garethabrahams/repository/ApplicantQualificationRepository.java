package com.garethabrahams.repository;

import com.garethabrahams.model.Applicant.ApplicantQualification;

import java.util.Set;

public interface ApplicantQualificationRepository extends IRepository<ApplicantQualification, String> {
    Set<ApplicantQualification> getAll();
}
