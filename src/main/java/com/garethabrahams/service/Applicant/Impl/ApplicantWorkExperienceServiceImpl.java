package com.garethabrahams.service.Applicant.Impl;

import com.garethabrahams.model.Applicant.ApplicantWorkExperience;
import com.garethabrahams.repository.Applicant.ApplicantWorkExperienceRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicantWorkExperienceRepositoryImpl;
import com.garethabrahams.service.Applicant.ApplicantWorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ApplicantWorkExperienceService")
public class ApplicantWorkExperienceServiceImpl implements ApplicantWorkExperienceService {

    private static ApplicantWorkExperienceService service = null;

    @Autowired
    @Qualifier("ApplicantWorkExperienceRepository")
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
