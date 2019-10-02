package com.garethabrahams.service.bridge;

import com.garethabrahams.model.bridge.ApplicantUserDetails;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantUserDetailsService extends IService<ApplicantUserDetails, String> {

    Set<ApplicantUserDetails> getAll();
}
