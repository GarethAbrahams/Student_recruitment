package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.model.bridge.ApplicantEmail;
import com.garethabrahams.model.bridge.ApplicantGender;
import com.garethabrahams.repository.bridge.ApplicantEmailRepository;
import com.garethabrahams.repository.bridge.ApplicantGenderRepository;

import java.util.HashSet;
import java.util.Set;

public class ApplicantGenderRepositoryImpl implements ApplicantGenderRepository {

    private static ApplicantGenderRepositoryImpl repository = null;
    private Set<ApplicantGender> applicantGenderSet;

    private ApplicantGenderRepositoryImpl(){
        this.applicantGenderSet = new HashSet<>();
    }

    public static ApplicantGenderRepositoryImpl getRepository(){
        if (repository==null)
            repository = new ApplicantGenderRepositoryImpl();

        return repository;
    }

    @Override
    public Set<ApplicantGender> getAll() {
        return this.applicantGenderSet;
    }

    @Override
    public ApplicantGender create(ApplicantGender e) {
        this.applicantGenderSet.add(e);
        return e;
    }

    @Override
    public ApplicantGender update(ApplicantGender e) {
        ApplicantGender oldAdd = read(e.getApplicantID());
        if(oldAdd != null) {
            delete(oldAdd.getApplicantID());
            create(e);
            return e;
        }
        return null;
    }

    @Override
    public void delete(String e) {
        ApplicantGender result = read(e);
        this.applicantGenderSet.remove(result);
    }

    @Override
    public ApplicantGender read(String e) {
        for (ApplicantGender applicantGender : this.applicantGenderSet){
            if (applicantGender.getApplicantID().equals(e))
                return applicantGender;
        }
        return null;
    }
}
