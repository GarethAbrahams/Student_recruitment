package com.garethabrahams.repository.Impl;

import com.garethabrahams.model.ApplicantSchool;
import com.garethabrahams.repository.ApplicantSchoolRepository;

import java.util.HashSet;
import java.util.Set;

public class ApplicantSchoolRepositoryImpl implements ApplicantSchoolRepository {
    private static ApplicantSchoolRepositoryImpl repository = null;
    private Set<ApplicantSchool> applicantsSchool;

    //HashSet - Store in memory
    private ApplicantSchoolRepositoryImpl() {

        this.applicantsSchool = new HashSet<>();
    }

    public static ApplicantSchoolRepositoryImpl getRepository(){
        if(repository==null)
            repository = new ApplicantSchoolRepositoryImpl();

        return repository;
    }

    @Override
    public Set<ApplicantSchool> getAll() {
        return this.applicantsSchool;
    }

    @Override
    public ApplicantSchool create(ApplicantSchool school) {
        this.applicantsSchool.add(school);
        return school;
    }

    @Override
    public ApplicantSchool update(ApplicantSchool school) {
        ApplicantSchool schoolOld = ApplicantSchoolSearch(school.getSchoolname());
        if (schoolOld != null){
            ApplicantSchool SchoolNew = new ApplicantSchool.Builder()
                    .copy(schoolOld)
                    .build();
            return create(SchoolNew);
        }
        return null;
    }

    @Override
    public void delete(String school) {
        this.applicantsSchool.remove(school);
    }

    @Override
    public ApplicantSchool read(String school) {

        return ApplicantSchoolSearch(school);
    }

    public ApplicantSchool ApplicantSchoolSearch(final String S){
        for (ApplicantSchool school: this.applicantsSchool){
            if (school.getSchoolname().equals(S))
                return school;
        }
        return null;
    }
}
