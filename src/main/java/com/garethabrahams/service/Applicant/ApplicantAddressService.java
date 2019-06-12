package com.garethabrahams.service.Applicant;

import com.garethabrahams.model.Applicant.ApplicantAddress;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantAddressService extends IService<ApplicantAddress,String> {
    Set<ApplicantAddress> getAll();
}
