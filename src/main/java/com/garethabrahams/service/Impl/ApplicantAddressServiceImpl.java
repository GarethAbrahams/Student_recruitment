package com.garethabrahams.service.Impl;

import com.garethabrahams.model.ApplicantAddress;
import com.garethabrahams.repository.ApplicantAddressRepository;
import com.garethabrahams.repository.Impl.ApplicantAddressRepositoryImpl;
import com.garethabrahams.service.ApplicantAddressService;

import java.util.Set;

public class ApplicantAddressServiceImpl implements ApplicantAddressService {

    private static ApplicantAddressService service = null;
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
