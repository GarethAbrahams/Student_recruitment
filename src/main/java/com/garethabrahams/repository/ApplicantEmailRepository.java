package com.garethabrahams.repository;

import com.garethabrahams.model.ApplicantEmail;

import java.util.Set;

public interface ApplicantEmailRepository extends IRepository<ApplicantEmail, String> {
    Set<ApplicantEmail> getAll();
}
