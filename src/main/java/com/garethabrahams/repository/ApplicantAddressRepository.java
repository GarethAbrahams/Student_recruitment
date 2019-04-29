package com.garethabrahams.repository;

import com.garethabrahams.model.Applicant.ApplicantAddress;

import java.util.Set;

public interface ApplicantAddressRepository extends IRepository<ApplicantAddress, String> {
    Set<ApplicantAddress> getAll();
}
