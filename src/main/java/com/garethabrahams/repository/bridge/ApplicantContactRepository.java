package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantContact;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantContactRepository extends IRepository <ApplicantContact,String> {
    Set<ApplicantContact> getAll();
}
