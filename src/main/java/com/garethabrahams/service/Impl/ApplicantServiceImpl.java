package com.garethabrahams.service.Impl;

import com.garethabrahams.model.Applicant;
import com.garethabrahams.repository.ApplicantRepository;
import com.garethabrahams.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("ApplicantService")
public class ApplicantServiceImpl implements ApplicantService {

    private static ApplicantService service = null;

    @Autowired
    private ApplicantRepository repository;

    public static ApplicantService getService(){
        if (service == null)
            service = new ApplicantServiceImpl();
        return service;
    }

    @Override
    public Applicant create(Applicant e) {
        return this.repository.save(e);
    }

    @Override
    public Applicant read(String s) {
        Optional<Applicant> result = this.repository.findById(s);
        return result.orElse(null);
    }

    @Override
    public Applicant update(Applicant e) {
        return this.repository.save(e);
    }

    @Override
    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public Applicant findByItem(String itemdesc) {
        List<Applicant> applicants = getAll();
        for (Applicant applicant : applicants) {
            if (applicant.getId().equalsIgnoreCase(itemdesc)) return applicant;
        }
        return null;
    }

    @Override
    public List<Applicant> getAll() {
        return this.repository.findAll();
    }

}
