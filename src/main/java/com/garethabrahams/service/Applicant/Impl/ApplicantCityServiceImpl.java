package com.garethabrahams.service.Applicant.Impl;

import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.repository.Applicant.ApplicantCityRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicationCityRepositoryImpl;
import com.garethabrahams.service.Applicant.ApplicantCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ApplicantCityService")
public class ApplicantCityServiceImpl implements ApplicantCityService {

    private static ApplicantCityService service = null;

    @Autowired
    @Qualifier("ApplicationCityRepository")
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
