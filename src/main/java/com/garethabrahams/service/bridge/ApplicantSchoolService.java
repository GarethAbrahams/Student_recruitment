package com.garethabrahams.service.bridge;

import com.garethabrahams.model.bridge.ApplicantSchool;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantSchoolService extends IService<ApplicantSchool, String> {

    Set<ApplicantSchool> getAll();
}
