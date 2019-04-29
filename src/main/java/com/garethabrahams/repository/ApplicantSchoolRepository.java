package com.garethabrahams.repository;

import com.garethabrahams.model.Applicant.ApplicantSchool;

import java.util.Set;

public interface ApplicantSchoolRepository extends IRepository<ApplicantSchool, String> {
    Set<ApplicantSchool> getAll();
}