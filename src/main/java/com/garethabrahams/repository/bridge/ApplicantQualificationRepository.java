package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantQualification;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantQualificationRepository extends IRepository <ApplicantQualification,String> {
    Set<ApplicantQualification> getAll();
}
