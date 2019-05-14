package com.garethabrahams.service.Impl;

import com.garethabrahams.model.ApplicantEmail;
import com.garethabrahams.repository.ApplicantEmailRepository;
import com.garethabrahams.repository.Impl.ApplicantEmailRepositoryImpl;
import com.garethabrahams.service.ApplicantEmailService;

import java.util.Set;

public class ApplicantEmailServiceImpl implements ApplicantEmailService {

    private static ApplicantEmailService service = null;
    private ApplicantEmailRepository repository;

    private ApplicantEmailServiceImpl(){

        this.repository = ApplicantEmailRepositoryImpl.getRepository();
    }

    public static ApplicantEmailService getApplicantEmailService(){
        if (service==null)
            service = new ApplicantEmailServiceImpl();
        return service;
    }

    @Override
    public Set<ApplicantEmail> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ApplicantEmail create(ApplicantEmail e) {
        return this.repository.create(e);
    }

    @Override
    public ApplicantEmail read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ApplicantEmail update(ApplicantEmail e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
