package com.garethabrahams.repository;

import com.garethabrahams.model.Applicant.ApplicantCity;

import java.util.Set;

public interface ApplicantCityRepository extends IRepository<ApplicantCity, String>{
    Set<ApplicantCity> getAll();
}
