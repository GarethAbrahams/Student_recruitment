package com.garethabrahams.service.Applicant.Impl;

import com.garethabrahams.model.Applicant.ApplicantContact;
import com.garethabrahams.repository.Applicant.ApplicantContactRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicantContactRepositoryImpl;
import com.garethabrahams.service.Applicant.ApplicantContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ApplicantContactService")
public class ApplicantContactServiceImpl implements ApplicantContactService {

    private static ApplicantContactService service = null;

    @Autowired
    @Qualifier("ApplicantContactRepository")
    private ApplicantContactRepository repository;

    private ApplicantContactServiceImpl(){

        this.repository = ApplicantContactRepositoryImpl.getRepository();
    }

    public static ApplicantContactService getApplicantContactService(){
        if (service==null)
            service = new ApplicantContactServiceImpl();
        return service;
    }

    @Override
    public Set<ApplicantContact> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ApplicantContact create(ApplicantContact e) {
        return this.repository.create(e);
    }

    @Override
    public ApplicantContact read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ApplicantContact update(ApplicantContact e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
