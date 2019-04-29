package com.garethabrahams.repository;

import com.garethabrahams.model.Applicant.ApplicantEmail;

import java.util.Set;

public interface ApplicantEmailRepository extends IRepository<ApplicantEmail, String> {
    Set<ApplicantEmail> getAll();
}
