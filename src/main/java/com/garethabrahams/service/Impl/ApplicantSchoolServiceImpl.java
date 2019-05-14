package com.garethabrahams.service.Impl;

import com.garethabrahams.model.ApplicantSchool;
import com.garethabrahams.repository.ApplicantSchoolRepository;
import com.garethabrahams.repository.Impl.ApplicantSchoolRepositoryImpl;
import com.garethabrahams.service.ApplicantSchoolService;

import java.util.Set;

public class ApplicantSchoolServiceImpl implements ApplicantSchoolService {

    private static ApplicantSchoolService service = null;
    private ApplicantSchoolRepository repository;

    private ApplicantSchoolServiceImpl(){

        this.repository = ApplicantSchoolRepositoryImpl.getRepository();
    }

    public static ApplicantSchoolService getApplicantSchoolService(){
        if (service==null)
            service = new ApplicantSchoolServiceImpl();
        return service;
    }

    @Override
    public Set<ApplicantSchool> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ApplicantSchool create(ApplicantSchool e) {
        return this.repository.create(e);
    }

    @Override
    public ApplicantSchool read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ApplicantSchool update(ApplicantSchool e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
