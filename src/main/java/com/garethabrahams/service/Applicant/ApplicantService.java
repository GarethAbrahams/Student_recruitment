package com.garethabrahams.service.Applicant;

import com.garethabrahams.model.Applicant.Applicant;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantService extends IService<Applicant, String> {

    Set<Applicant> getAll();
}
