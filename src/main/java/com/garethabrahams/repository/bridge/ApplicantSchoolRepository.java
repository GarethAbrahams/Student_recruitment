package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantRole;
import com.garethabrahams.model.bridge.ApplicantSchool;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantSchoolRepository extends IRepository <ApplicantSchool,String> {
    Set<ApplicantSchool> getAll();
}
