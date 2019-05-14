package com.garethabrahams.service.Impl;

import com.garethabrahams.model.ApplicantQualification;
import com.garethabrahams.repository.ApplicantQualificationRepository;
import com.garethabrahams.repository.Impl.ApplicantQualificationRepositoryImpl;
import com.garethabrahams.service.ApplicantQualificationService;

import java.util.Set;

public class ApplicantQualificationServiceImpl implements ApplicantQualificationService {

    private static ApplicantQualificationService service = null;
    private ApplicantQualificationRepository repository;

    private ApplicantQualificationServiceImpl(){

        this.repository = ApplicantQualificationRepositoryImpl.getRepository();
    }

    public static ApplicantQualificationService getApplicantQualificationService(){
        if (service==null)
            service = new ApplicantQualificationServiceImpl();
        return service;
    }

    @Override
    public Set<ApplicantQualification> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ApplicantQualification create(ApplicantQualification e) {
        return this.repository.create(e);
    }

    @Override
    public ApplicantQualification read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ApplicantQualification update(ApplicantQualification e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
