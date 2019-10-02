package com.garethabrahams.service.Impl;

import com.garethabrahams.model.Address;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.repository.AddressRepository;
import com.garethabrahams.repository.ApplicantRepository;
import com.garethabrahams.service.AddressService;
import com.garethabrahams.service.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("AddressService")
public class AddressServiceImpl implements AddressService {

    private static AddressService service = null;

    @Autowired
    private AddressRepository repository;

    public static AddressService getService(){
        if (service == null)
            service = new AddressServiceImpl();
        return service;
    }

    @Override
    public Address create(Address e) {
        return this.repository.save(e);
    }

    @Override
    public Address read(String s) {
        Optional<Address> result = this.repository.findById(s);
        return result.orElse(null);
    }

    @Override
    public Address update(Address e) {
        return this.repository.save(e);
    }

    @Override
    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public Address findByItem(String itemdesc) {
        List<Address> addresses = getAll();
        for (Address address : addresses) {
            if (address.getStreetAddress().equalsIgnoreCase(itemdesc)) return address;
        }
        return null;
    }

    @Override
    public List<Address> getAll() {
        return this.repository.findAll();
    }

}
