package com.garethabrahams.service.Applicant;

import com.garethabrahams.model.Applicant.ApplicantQualification;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantQualificationService extends IService<ApplicantQualification, String> {
    Set<ApplicantQualification> getAll();
}
