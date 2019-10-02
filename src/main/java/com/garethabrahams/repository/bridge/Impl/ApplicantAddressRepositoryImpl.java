package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.model.Address;
import com.garethabrahams.model.bridge.ApplicantAddress;
import com.garethabrahams.repository.AddressRepository;
import com.garethabrahams.repository.bridge.ApplicantAddressRepository;

import java.util.HashSet;
import java.util.Set;

public class ApplicantAddressRepositoryImpl implements ApplicantAddressRepository {

    private static ApplicantAddressRepositoryImpl repository = null;
    private Set<ApplicantAddress> applicantAddressSet;

    private ApplicantAddressRepositoryImpl(){
        this.applicantAddressSet = new HashSet<>();
    }

    public static ApplicantAddressRepositoryImpl getRepository(){
        if (repository==null)
            repository = new ApplicantAddressRepositoryImpl();

        return repository;
    }

    @Override
    public Set<ApplicantAddress> getAll() {
        return this.applicantAddressSet;
    }

    @Override
    public ApplicantAddress create(ApplicantAddress e) {
        this.applicantAddressSet.add(e);
        return e;
    }

    @Override
    public ApplicantAddress update(ApplicantAddress e) {
        ApplicantAddress oldAdd = read(e.getApplicantID());
        if(oldAdd != null) {
            delete(oldAdd.getApplicantID());
            create(e);
            return e;
        }
        return null;
    }

    @Override
    public void delete(String e) {
        ApplicantAddress result = read(e);
        this.applicantAddressSet.remove(result);
    }

    @Override
    public ApplicantAddress read(String e) {
        for (ApplicantAddress applicantAddress : this.applicantAddressSet){
            if (applicantAddress.getApplicantID().equals(e))
                return applicantAddress;
        }
        return null;
    }
}
