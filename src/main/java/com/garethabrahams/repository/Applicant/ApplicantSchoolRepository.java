package com.garethabrahams.repository.Applicant;

import com.garethabrahams.model.Applicant.ApplicantSchool;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantSchoolRepository extends IRepository<ApplicantSchool, String> {
    Set<ApplicantSchool> getAll();
}
