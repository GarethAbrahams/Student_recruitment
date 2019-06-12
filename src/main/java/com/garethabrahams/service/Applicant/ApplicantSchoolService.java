package com.garethabrahams.service.Applicant;

import com.garethabrahams.model.Applicant.ApplicantSchool;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantSchoolService extends IService<ApplicantSchool,String> {
    Set<ApplicantSchool> getAll();
}
