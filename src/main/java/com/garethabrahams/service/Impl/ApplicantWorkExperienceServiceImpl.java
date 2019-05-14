package com.garethabrahams.service.Impl;

import com.garethabrahams.model.ApplicantWorkExperience;
import com.garethabrahams.repository.ApplicantWorkExperienceRepository;
import com.garethabrahams.repository.Impl.ApplicantWorkExperienceRepositoryImpl;
import com.garethabrahams.service.ApplicantWorkExperienceService;

import java.util.Set;

public class ApplicantWorkExperienceServiceImpl implements ApplicantWorkExperienceService {

    private static ApplicantWorkExperienceService service = null;
    private ApplicantWorkExperienceRepository repository;

    private ApplicantWorkExperienceServiceImpl(){

        this.repository = ApplicantWorkExperienceRepositoryImpl.getRepository();
    }

    public static ApplicantWorkExperienceService getApplicantWorkExperienceService(){
        if (service==null)
            service = new ApplicantWorkExperienceServiceImpl();
        return service;
    }

    @Override
    public Set<ApplicantWorkExperience> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ApplicantWorkExperience create(ApplicantWorkExperience e) {
        return this.repository.create(e);
    }

    @Override
    public ApplicantWorkExperience read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ApplicantWorkExperience update(ApplicantWorkExperience e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
