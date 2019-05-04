package com.garethabrahams.repository.Impl;

import com.garethabrahams.model.ApplicantQualification;
import com.garethabrahams.repository.ApplicantQualificationRepository;

import java.util.HashSet;
import java.util.Set;

public class ApplicantQualificationRepositoryImpl implements ApplicantQualificationRepository {

    private static ApplicantQualificationRepositoryImpl repository = null;
    private Set<ApplicantQualification> applicantsQualification;

    //HashSet - Store in memory
    private ApplicantQualificationRepositoryImpl() {

        this.applicantsQualification = new HashSet<>();
    }

    public static ApplicantQualificationRepositoryImpl getRepository(){
        if(repository==null)
            repository = new ApplicantQualificationRepositoryImpl();

        return repository;
    }

    @Override
    public Set<ApplicantQualification> getAll() {
        return this.applicantsQualification;
    }

    @Override
    public ApplicantQualification create(ApplicantQualification qualification) {
        this.applicantsQualification.add(qualification);
        return qualification;
    }

    @Override
    public ApplicantQualification update(ApplicantQualification Qual) {
        ApplicantQualification QualificationOld = ApplicantQualificationSearch(Qual.getQualificationName());
        if (QualificationOld != null){
            ApplicantQualification QualificationNew = new ApplicantQualification.Builder()
                    .copy(QualificationOld)
                    .build();
            return create(QualificationNew);
        }
        return null;
    }

    @Override
    public void delete(String qual) {
        this.applicantsQualification.remove(qual);
    }

    @Override
    public ApplicantQualification read(String Qual) {
        return ApplicantQualificationSearch(Qual);
    }

    public ApplicantQualification ApplicantQualificationSearch(final String Qual){
        for (ApplicantQualification qualification: this.applicantsQualification){
            if (qualification.getQualificationName().equals(Qual))
                return qualification;
        }
        return null;
    }
}
