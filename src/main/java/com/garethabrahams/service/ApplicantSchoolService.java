package com.garethabrahams.service;

import com.garethabrahams.model.ApplicantSchool;

import java.util.Set;

public interface ApplicantSchoolService extends IService<ApplicantSchool,String> {
    Set<ApplicantSchool> getAll();
}
