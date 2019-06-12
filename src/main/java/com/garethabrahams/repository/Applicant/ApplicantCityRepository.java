package com.garethabrahams.repository.Applicant;

import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantCityRepository extends IRepository<ApplicantCity, String> {
    Set<ApplicantCity> getAll();
}
