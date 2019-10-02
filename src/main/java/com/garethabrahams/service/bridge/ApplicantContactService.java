package com.garethabrahams.service.bridge;

import com.garethabrahams.model.bridge.ApplicantContact;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantContactService extends IService<ApplicantContact, String> {

    Set<ApplicantContact> getAll();
}
