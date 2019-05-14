package com.garethabrahams.service;

import com.garethabrahams.model.ApplicantAddress;

import java.util.Set;

public interface ApplicantAddressService extends IService<ApplicantAddress,String> {
    Set<ApplicantAddress> getAll();
}
