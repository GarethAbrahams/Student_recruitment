package com.garethabrahams.service.Applicant.Impl;

import com.garethabrahams.model.Applicant.ApplicantQualification;
import com.garethabrahams.repository.Applicant.ApplicantQualificationRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicantQualificationRepositoryImpl;
import com.garethabrahams.service.Applicant.ApplicantQualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ApplicantQualificationService")
public class ApplicantQualificationServiceImpl implements ApplicantQualificationService {

    private static ApplicantQualificationService service = null;
    @Autowired
    @Qualifier("ApplicantQualificationRepository")
    private ApplicantQualificationRepository repository;

    private ApplicantQualificationServiceImpl(){

        this.repository = ApplicantQualificationRepositoryImpl.getRepository();
    }

    public static ApplicantQualificationService getApplicantQualificationService(){
        if (service==null)
            service = new ApplicantQualificationServiceImpl();
        return service;
    }

    @Override
    public Set<ApplicantQualification> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ApplicantQualification create(ApplicantQualification e) {
        return this.repository.create(e);
    }

    @Override
    public ApplicantQualification read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ApplicantQualification update(ApplicantQualification e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
