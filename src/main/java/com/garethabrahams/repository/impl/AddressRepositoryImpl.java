package com.garethabrahams.repository.impl;

import com.garethabrahams.model.Address;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.repository.AddressRepository;

import java.util.HashSet;
import java.util.Set;

public class AddressRepositoryImpl implements AddressRepository {

    private static AddressRepositoryImpl repository = null;
    private Set<Address> addresses;

    private AddressRepositoryImpl(){
        this.addresses = new HashSet<>();
    }

    public static AddressRepositoryImpl getRepository(){
        if (repository==null)
            repository = new AddressRepositoryImpl();

        return repository;
    }

    @Override
    public Set<Address> getAll() {
        return this.addresses;
    }

    @Override
    public Address create(Address e) {
        this.addresses.add(e);
        return e;
    }

    @Override
    public Address update(Address e) {
        Address oldAdd = read(e.getAddressID());
        if(oldAdd != null) {
            Address newAdd = new Address.Builder()
                    .copy(e)
                    .build();
            return create(newAdd);
        }
        return null;
    }

    @Override
    public void delete(String e) {
        Address result = read(e);
        this.addresses.remove(result);
    }

    @Override
    public Address read(String e) {
        for (Address address : this.addresses){
            if (address.getAddressID().equals(e))
                return address;
        }
        return null;
    }
}
