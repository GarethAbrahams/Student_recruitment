package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.model.bridge.ApplicantSchool;
import com.garethabrahams.model.bridge.ApplicantUserDetails;
import com.garethabrahams.repository.bridge.ApplicantSchoolRepository;
import com.garethabrahams.repository.bridge.ApplicantUserDetailsRepository;

import java.util.HashSet;
import java.util.Set;

public class ApplicantUserDetailsRepositoryImpl implements ApplicantUserDetailsRepository {

    private static ApplicantUserDetailsRepositoryImpl repository = null;
    private Set<ApplicantUserDetails> applicantUserDetailsSet;

    private ApplicantUserDetailsRepositoryImpl(){
        this.applicantUserDetailsSet = new HashSet<>();
    }

    public static ApplicantUserDetailsRepositoryImpl getRepository(){
        if (repository==null)
            repository = new ApplicantUserDetailsRepositoryImpl();

        return repository;
    }

    @Override
    public Set<ApplicantUserDetails> getAll() {
        return this.applicantUserDetailsSet;
    }

    @Override
    public ApplicantUserDetails create(ApplicantUserDetails e) {
        this.applicantUserDetailsSet.add(e);
        return e;
    }

    @Override
    public ApplicantUserDetails update(ApplicantUserDetails e) {
        ApplicantUserDetails oldAdd = read(e.getApplicantID());
        if(oldAdd != null) {
            delete(oldAdd.getApplicantID());
            create(e);
            return e;
        }
        return null;
    }

    @Override
    public void delete(String e) {
        ApplicantUserDetails result = read(e);
        this.applicantUserDetailsSet.remove(result);
    }

    @Override
    public ApplicantUserDetails read(String e) {
        for (ApplicantUserDetails applicantUserDetails : this.applicantUserDetailsSet){
            if (applicantUserDetails.getApplicantID().equals(e))
                return applicantUserDetails;
        }
        return null;
    }
}
