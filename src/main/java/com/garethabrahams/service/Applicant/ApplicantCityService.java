package com.garethabrahams.service.Applicant;

import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantCityService extends IService<ApplicantCity,String> {
    Set<ApplicantCity> getAll();
}
