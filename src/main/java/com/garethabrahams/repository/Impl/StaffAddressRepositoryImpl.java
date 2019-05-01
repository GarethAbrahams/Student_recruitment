package com.garethabrahams.repository.Impl;

import com.garethabrahams.model.Staff.StaffAddress;
import com.garethabrahams.repository.StaffAddressRepository;

import java.util.HashSet;
import java.util.Set;

public class StaffAddressRepositoryImpl implements StaffAddressRepository {

    private static StaffAddressRepositoryImpl repository = null;
    private Set<StaffAddress> addresses;

    //HashSet - Store in memory
    private StaffAddressRepositoryImpl() {

        this.addresses = new HashSet<>();
    }

    public static StaffAddressRepositoryImpl getRepository(){
        if(repository==null)
            repository = new StaffAddressRepositoryImpl();

        return repository;
    }

    public StaffAddress addressSearch(final String a){
        for (StaffAddress address: this.addresses){
            if (address.getAddress().equals(a))
                return address;
        }
        return null;
    }

    @Override
    public Set<StaffAddress> getAll() {
        return this.addresses;
    }

    @Override
    public StaffAddress create(StaffAddress e) {
        this.addresses.add(e);
        return e;
    }

    @Override
    public StaffAddress update(StaffAddress e) {
        StaffAddress addressOld = addressSearch(e.getAddress());
        if (addressOld != null){
            StaffAddress addressNew = new StaffAddress.Builder()
                    .copy(e)
                    .build();
            return create(addressNew);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.addresses.remove(s);
    }

    @Override
    public StaffAddress read(String s) {
        return addressSearch(s);
    }
}
