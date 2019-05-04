package com.garethabrahams.repository;

import com.garethabrahams.model.ApplicantCity;

import java.util.Set;

public interface ApplicantCityRepository extends IRepository<ApplicantCity, String>{
    Set<ApplicantCity> getAll();
}
