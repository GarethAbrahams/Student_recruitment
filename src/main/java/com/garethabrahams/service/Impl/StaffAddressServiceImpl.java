package com.garethabrahams.service.Impl;

import com.garethabrahams.model.StaffAddress;
import com.garethabrahams.repository.Impl.StaffAddressRepositoryImpl;
import com.garethabrahams.repository.StaffAddressRepository;
import com.garethabrahams.service.StaffAddressService;

import java.util.Set;

public class StaffAddressServiceImpl implements StaffAddressService {

    private static StaffAddressService service = null;
    private StaffAddressRepository repository;

    private StaffAddressServiceImpl(){

        this.repository = StaffAddressRepositoryImpl.getRepository();
    }

    public static StaffAddressService getStaffAddressService(){
        if (service==null)
            service = new StaffAddressServiceImpl();
        return service;
    }

    @Override
    public Set<StaffAddress> getAll() {
        return this.repository.getAll();
    }

    @Override
    public StaffAddress create(StaffAddress e) {
        return this.repository.create(e);
    }

    @Override
    public StaffAddress read(String s) {
        return this.repository.read(s);
    }

    @Override
    public StaffAddress update(StaffAddress e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
