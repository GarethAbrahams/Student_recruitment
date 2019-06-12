package com.garethabrahams.service.Applicant.Impl;

import com.garethabrahams.model.Applicant.Applicant;
import com.garethabrahams.repository.Applicant.ApplicantRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicantRepositoryImpl;
import com.garethabrahams.service.Applicant.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ApplicantService")
public class ApplicantServiceImpl implements ApplicantService {

    private static ApplicantService service = null;

    @Autowired
    @Qualifier("ApplicantRepository")
    private ApplicantRepository repository;

    public static ApplicantService getApplicantService(){
        if (service==null)
            service = new ApplicantServiceImpl();
        return service;
    }

    @Override
    public Set<Applicant> getAll() {

        return this.repository.getAll();
    }

    @Override
    public Applicant create(Applicant applicant) {

        return this.repository.create(applicant);
    }

    @Override
    public Applicant read(String id) {

        return this.repository.read(id);
    }

    @Override
    public Applicant update(Applicant applicant) {
        return this.repository.update(applicant);
    }

    @Override
    public void delete(String id) {
        this.repository.delete(id);
    }

}
