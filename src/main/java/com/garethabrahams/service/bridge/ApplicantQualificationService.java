package com.garethabrahams.service.bridge;

import com.garethabrahams.model.bridge.ApplicantQualification;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantQualificationService extends IService<ApplicantQualification, String> {

    Set<ApplicantQualification> getAll();
}
