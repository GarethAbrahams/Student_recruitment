package com.garethabrahams.service;

import com.garethabrahams.model.Applicant;

import java.util.Set;

public interface ApplicantService extends IService <Applicant, String> {

    Set<Applicant> getAll();
}
