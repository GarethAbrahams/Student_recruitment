package com.garethabrahams.service;

import com.garethabrahams.model.ApplicantCity;

import java.util.Set;

public interface ApplicantCityService extends IService <ApplicantCity,String> {
    Set<ApplicantCity> getAll();
}
