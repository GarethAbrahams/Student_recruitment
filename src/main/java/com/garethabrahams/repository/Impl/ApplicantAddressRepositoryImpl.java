package com.garethabrahams.repository.Impl;

import com.garethabrahams.model.Applicant.ApplicantAddress;
import com.garethabrahams.repository.ApplicantAddressRepository;

import java.util.HashSet;
import java.util.Set;

public class ApplicantAddressRepositoryImpl implements ApplicantAddressRepository {

    private static ApplicantAddressRepositoryImpl repository = null;
    private Set<ApplicantAddress> applicantsAddress;

    //HashSet - Store in memory
    private ApplicantAddressRepositoryImpl(){
        this.applicantsAddress = new HashSet<>();
    }

    public static ApplicantAddressRepositoryImpl getRepository(){
        if(repository==null)
            repository = new ApplicantAddressRepositoryImpl();

        return repository;
    }

    @Override
    public Set<ApplicantAddress> getAll() {
        return this.applicantsAddress;
    }

    @Override
    public ApplicantAddress create(ApplicantAddress value) {
        this.applicantsAddress.add(value);

        return value;
    }

    @Override
    public ApplicantAddress update(ApplicantAddress e) {

        ApplicantAddress addressOld = ApplicantAddressSearch(e.getAddress());
        if (addressOld != null){
            ApplicantAddress ApplicantNew = new ApplicantAddress.Builder()
                    .copy(addressOld)
                    .build();
            return create(ApplicantNew);
        }
        return null;
    }

    @Override
    public void delete(String value) {
       this.applicantsAddress.remove(value);
    }

    @Override
    public ApplicantAddress read(String s) {
        return ApplicantAddressSearch(s);
    }

    public ApplicantAddress ApplicantAddressSearch(final String value){
        for (ApplicantAddress address: this.applicantsAddress){
            if (address.getAddress().equals(value))
                return address;
        }
        return null;
    }
}
