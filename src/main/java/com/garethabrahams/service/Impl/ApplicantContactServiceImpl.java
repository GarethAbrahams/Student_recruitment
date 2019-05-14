package com.garethabrahams.service.Impl;

import com.garethabrahams.model.ApplicantContact;
import com.garethabrahams.repository.ApplicantContactRepository;
import com.garethabrahams.repository.Impl.ApplicantContactRepositoryImpl;
import com.garethabrahams.service.ApplicantContactService;

import java.util.Set;

public class ApplicantContactServiceImpl implements ApplicantContactService {

    private static ApplicantContactService service = null;
    private ApplicantContactRepository repository;

    private ApplicantContactServiceImpl(){

        this.repository = ApplicantContactRepositoryImpl.getRepository();
    }

    public static ApplicantContactService getApplicantContactService(){
        if (service==null)
            service = new ApplicantContactServiceImpl();
        return service;
    }

    @Override
    public Set<ApplicantContact> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ApplicantContact create(ApplicantContact e) {
        return this.repository.create(e);
    }

    @Override
    public ApplicantContact read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ApplicantContact update(ApplicantContact e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
