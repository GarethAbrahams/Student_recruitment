package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantAddress;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantAddressRepository extends IRepository <ApplicantAddress,String> {
    Set<ApplicantAddress> getAll();
}
