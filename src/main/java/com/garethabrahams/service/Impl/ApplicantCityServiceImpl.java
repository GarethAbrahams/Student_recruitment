package com.garethabrahams.service.Impl;

import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.repository.ApplicantCityRepository;
import com.garethabrahams.repository.Impl.ApplicationCityRepositoryImpl;
import com.garethabrahams.service.ApplicantCityService;

import java.util.Set;

public class ApplicantCityServiceImpl implements ApplicantCityService {

    private static ApplicantCityService service = null;
    private ApplicantCityRepository repository;

    private ApplicantCityServiceImpl(){

        this.repository = ApplicationCityRepositoryImpl.getRepository();
    }

    public static ApplicantCityService getApplicantCityService(){
        if (service==null)
            service = new ApplicantCityServiceImpl();
        return service;
    }

    @Override
    public Set<ApplicantCity> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ApplicantCity create(ApplicantCity e) {
        return this.repository.create(e);
    }

    @Override
    public ApplicantCity read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ApplicantCity update(ApplicantCity e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
