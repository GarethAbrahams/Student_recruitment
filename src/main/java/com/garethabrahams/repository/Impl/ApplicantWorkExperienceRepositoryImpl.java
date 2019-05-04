package com.garethabrahams.repository.Impl;

import com.garethabrahams.model.ApplicantWorkExperience;
import com.garethabrahams.repository.ApplicantWorkExperienceRepository;

import java.util.HashSet;
import java.util.Set;

public class ApplicantWorkExperienceRepositoryImpl implements ApplicantWorkExperienceRepository {
    private static ApplicantWorkExperienceRepositoryImpl repository = null;
    private Set<ApplicantWorkExperience> applicantsWorkExperience;

    //HashSet - Store in memory
    private ApplicantWorkExperienceRepositoryImpl() {

        this.applicantsWorkExperience = new HashSet<>();
    }

    public static ApplicantWorkExperienceRepositoryImpl getRepository(){
        if(repository==null)
            repository = new ApplicantWorkExperienceRepositoryImpl();

        return repository;
    }


    @Override
    public Set<ApplicantWorkExperience> getAll() {
        return this.applicantsWorkExperience;
    }

    @Override
    public ApplicantWorkExperience create(ApplicantWorkExperience company) {
        this.applicantsWorkExperience.add(company);
        return company;
    }

    @Override
    public ApplicantWorkExperience update(ApplicantWorkExperience company) {
        ApplicantWorkExperience companyOld = ApplicantWorkExperienceSearch(company.getCompany());
        if (companyOld != null){
            ApplicantWorkExperience companyNew = new ApplicantWorkExperience.Builder()
                    .copy(companyOld)
                    .build();
            return create(companyNew);
        }
        return null;
    }

    @Override
    public void delete(String company) {
        this.applicantsWorkExperience.remove(company);
    }

    @Override
    public ApplicantWorkExperience read(String company) {
        return ApplicantWorkExperienceSearch(company);
    }

    public ApplicantWorkExperience ApplicantWorkExperienceSearch(final String company){
        for (ApplicantWorkExperience Work: this.applicantsWorkExperience){
            if (Work.getCompany().equals(company))
                return Work;
        }
        return null;
    }
}
