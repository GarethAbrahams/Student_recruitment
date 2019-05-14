package com.garethabrahams.service;

import com.garethabrahams.model.ApplicantQualification;

import java.util.Set;

public interface ApplicantQualificationService extends IService <ApplicantQualification, String> {
    Set<ApplicantQualification> getAll();
}
