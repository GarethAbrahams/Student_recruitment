package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.model.bridge.ApplicantGender;
import com.garethabrahams.model.bridge.ApplicantOutcome;
import com.garethabrahams.repository.bridge.ApplicantGenderRepository;
import com.garethabrahams.repository.bridge.ApplicantOutcomeRepository;

import java.util.HashSet;
import java.util.Set;

public class ApplicantOutcomeRepositoryImpl implements ApplicantOutcomeRepository {

    private static ApplicantOutcomeRepositoryImpl repository = null;
    private Set<ApplicantOutcome> applicantOutcomeSet;

    private ApplicantOutcomeRepositoryImpl(){
        this.applicantOutcomeSet = new HashSet<>();
    }

    public static ApplicantOutcomeRepositoryImpl getRepository(){
        if (repository==null)
            repository = new ApplicantOutcomeRepositoryImpl();

        return repository;
    }

    @Override
    public Set<ApplicantOutcome> getAll() {
        return this.applicantOutcomeSet;
    }

    @Override
    public ApplicantOutcome create(ApplicantOutcome e) {
        this.applicantOutcomeSet.add(e);
        return e;
    }

    @Override
    public ApplicantOutcome update(ApplicantOutcome e) {
        ApplicantOutcome oldAdd = read(e.getApplicantID());
        if(oldAdd != null) {
            delete(oldAdd.getApplicantID());
            create(e);
            return e;
        }
        return null;
    }

    @Override
    public void delete(String e) {
        ApplicantOutcome result = read(e);
        this.applicantOutcomeSet.remove(result);
    }

    @Override
    public ApplicantOutcome read(String e) {
        for (ApplicantOutcome applicantOutcome : this.applicantOutcomeSet){
            if (applicantOutcome.getApplicantID().equals(e))
                return applicantOutcome;
        }
        return null;
    }
}
