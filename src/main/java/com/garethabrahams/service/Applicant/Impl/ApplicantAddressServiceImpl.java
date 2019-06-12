package com.garethabrahams.service.Applicant.Impl;

import com.garethabrahams.model.Applicant.ApplicantAddress;
import com.garethabrahams.repository.Applicant.ApplicantAddressRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicantAddressRepositoryImpl;
import com.garethabrahams.service.Applicant.ApplicantAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("ApplicantAddressService")
public class ApplicantAddressServiceImpl implements ApplicantAddressService {

    private static ApplicantAddressService service = null;

    @Autowired
    @Qualifier("ApplicantAddressRepository")
    private ApplicantAddressRepository repository;

    private ApplicantAddressServiceImpl(){

        repository = ApplicantAddressRepositoryImpl.getRepository();
    }


    public static ApplicantAddressService getApplicantAddressService(){
        if (service==null)
            service = new ApplicantAddressServiceImpl();
        return service;
    }

    @Override
    public Set<ApplicantAddress> getAll() {
        return this.repository.getAll();
    }

    @Override
    public ApplicantAddress create(ApplicantAddress e) {
        return this.repository.create(e);
    }

    @Override
    public ApplicantAddress read(String s) {
        return this.repository.read(s);
    }

    @Override
    public ApplicantAddress update(ApplicantAddress e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
