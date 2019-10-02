package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantSchool;
import com.garethabrahams.model.bridge.ApplicantUserDetails;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantUserDetailsRepository extends IRepository <ApplicantUserDetails,String> {
    Set<ApplicantUserDetails> getAll();
}
