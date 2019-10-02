package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.model.bridge.ApplicantRole;
import com.garethabrahams.model.bridge.ApplicantSchool;
import com.garethabrahams.repository.bridge.ApplicantRoleRepository;
import com.garethabrahams.repository.bridge.ApplicantSchoolRepository;

import java.util.HashSet;
import java.util.Set;

public class ApplicantSchoolRepositoryImpl implements ApplicantSchoolRepository {

    private static ApplicantSchoolRepositoryImpl repository = null;
    private Set<ApplicantSchool> applicantSchoolSet;

    private ApplicantSchoolRepositoryImpl(){
        this.applicantSchoolSet = new HashSet<>();
    }

    public static ApplicantSchoolRepositoryImpl getRepository(){
        if (repository==null)
            repository = new ApplicantSchoolRepositoryImpl();

        return repository;
    }

    @Override
    public Set<ApplicantSchool> getAll() {
        return this.applicantSchoolSet;
    }

    @Override
    public ApplicantSchool create(ApplicantSchool e) {
        this.applicantSchoolSet.add(e);
        return e;
    }

    @Override
    public ApplicantSchool update(ApplicantSchool e) {
        ApplicantSchool oldAdd = read(e.getApplicantID());
        if(oldAdd != null) {
            delete(oldAdd.getApplicantID());
            create(e);
            return e;
        }
        return null;
    }

    @Override
    public void delete(String e) {
        ApplicantSchool result = read(e);
        this.applicantSchoolSet.remove(result);
    }

    @Override
    public ApplicantSchool read(String e) {
        for (ApplicantSchool applicantSchool : this.applicantSchoolSet){
            if (applicantSchool.getApplicantID().equals(e))
                return applicantSchool;
        }
        return null;
    }
}
