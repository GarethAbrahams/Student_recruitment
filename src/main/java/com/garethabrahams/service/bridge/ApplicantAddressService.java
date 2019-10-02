package com.garethabrahams.service.bridge;

import com.garethabrahams.model.bridge.ApplicantAddress;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantAddressService extends IService<ApplicantAddress, String> {

    Set<ApplicantAddress> getAll();
}
