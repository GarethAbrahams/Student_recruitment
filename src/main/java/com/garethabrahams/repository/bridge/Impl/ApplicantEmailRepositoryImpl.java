package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.model.bridge.ApplicantContact;
import com.garethabrahams.model.bridge.ApplicantEmail;
import com.garethabrahams.repository.bridge.ApplicantContactRepository;
import com.garethabrahams.repository.bridge.ApplicantEmailRepository;

import java.util.HashSet;
import java.util.Set;

public class ApplicantEmailRepositoryImpl implements ApplicantEmailRepository {

    private static ApplicantEmailRepositoryImpl repository = null;
    private Set<ApplicantEmail> applicantEmailSet;

    private ApplicantEmailRepositoryImpl(){
        this.applicantEmailSet = new HashSet<>();
    }

    public static ApplicantEmailRepositoryImpl getRepository(){
        if (repository==null)
            repository = new ApplicantEmailRepositoryImpl();

        return repository;
    }

    @Override
    public Set<ApplicantEmail> getAll() {
        return this.applicantEmailSet;
    }

    @Override
    public ApplicantEmail create(ApplicantEmail e) {
        this.applicantEmailSet.add(e);
        return e;
    }

    @Override
    public ApplicantEmail update(ApplicantEmail e) {
        ApplicantEmail oldAdd = read(e.getApplicantID());
        if(oldAdd != null) {
            delete(oldAdd.getApplicantID());
            create(e);
            return e;
        }
        return null;
    }

    @Override
    public void delete(String e) {
        ApplicantEmail result = read(e);
        this.applicantEmailSet.remove(result);
    }

    @Override
    public ApplicantEmail read(String e) {
        for (ApplicantEmail applicantEmail : this.applicantEmailSet){
            if (applicantEmail.getApplicantID().equals(e))
                return applicantEmail;
        }
        return null;
    }
}
