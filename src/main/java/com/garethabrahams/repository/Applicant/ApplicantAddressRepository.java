package com.garethabrahams.repository.Applicant;

import com.garethabrahams.model.Applicant.ApplicantAddress;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantAddressRepository extends IRepository<ApplicantAddress, String> {
    Set<ApplicantAddress> getAll();
}