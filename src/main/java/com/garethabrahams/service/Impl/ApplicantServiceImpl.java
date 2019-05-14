package com.garethabrahams.service.Impl;

import com.garethabrahams.model.Applicant;
import com.garethabrahams.repository.ApplicantRepository;
import com.garethabrahams.repository.Impl.ApplicantRepositoryImpl;
import com.garethabrahams.service.ApplicantService;

import java.util.Set;

public class ApplicantServiceImpl implements ApplicantService {

    private static ApplicantService service = null;
    private ApplicantRepository repository;

    private ApplicantServiceImpl(){

        this.repository = ApplicantRepositoryImpl.getRepository();
    }

    public static ApplicantService getApplicantService(){
        if (service==null)
            service = new ApplicantServiceImpl();
        return service;
    }

    @Override
    public Set<Applicant> getAll() {

        return this.repository.getAll();
    }

    @Override
    public Applicant create(Applicant applicant) {

        return this.repository.create(applicant);
    }

    @Override
    public Applicant read(String id) {

        return this.repository.read(id);
    }

    @Override
    public Applicant update(Applicant applicant) {
        return this.repository.update(applicant);
    }

    @Override
    public void delete(String id) {
        this.repository.delete(id);
    }

}
