package com.garethabrahams.service.Applicant.Impl;

import com.garethabrahams.model.Applicant.ApplicantSchool;
import com.garethabrahams.repository.Applicant.ApplicantSchoolRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicantSchoolRepositoryImpl;
import com.garethabrahams.service.Applicant.ApplicantSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ApplicantSchoolService")
public class ApplicantSchoolServiceImpl implements ApplicantSchoolService {

    private static ApplicantSchoolService service = null;

    @Autowired
    @Qualifier("ApplicantSchoolRepository")
    private ApplicantSchoolRepository repository;

    private ApplicantSchoolServiceImpl(){

        this.repository = ApplicantSchoolRepositoryImpl.getRepository();
    }

    public static ApplicantSchoolService getApplicantSchoolService(){
        if (service==null)
            service = new ApplicantSchoolServiceImpl();
        return service;
    }

    @Override
    public Set<ApplicantSchool> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ApplicantSchool create(ApplicantSchool e) {
        return this.repository.create(e);
    }

    @Override
    public ApplicantSchool read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ApplicantSchool update(ApplicantSchool e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
