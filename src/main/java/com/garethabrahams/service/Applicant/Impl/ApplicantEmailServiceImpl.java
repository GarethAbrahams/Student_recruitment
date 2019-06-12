package com.garethabrahams.service.Applicant.Impl;

import com.garethabrahams.model.Applicant.ApplicantEmail;
import com.garethabrahams.repository.Applicant.ApplicantEmailRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicantEmailRepositoryImpl;
import com.garethabrahams.service.Applicant.ApplicantEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ApplicantEmailService")
public class ApplicantEmailServiceImpl implements ApplicantEmailService {

    private static ApplicantEmailService service = null;

    @Autowired
    @Qualifier("ApplicantEmailRepository")
    private ApplicantEmailRepository repository;

    private ApplicantEmailServiceImpl(){

        this.repository = ApplicantEmailRepositoryImpl.getRepository();
    }

    public static ApplicantEmailService getApplicantEmailService(){
        if (service==null)
            service = new ApplicantEmailServiceImpl();
        return service;
    }

    @Override
    public Set<ApplicantEmail> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ApplicantEmail create(ApplicantEmail e) {
        return this.repository.create(e);
    }

    @Override
    public ApplicantEmail read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ApplicantEmail update(ApplicantEmail e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
