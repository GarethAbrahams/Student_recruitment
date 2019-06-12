package com.garethabrahams.service.Staff.Impl;

import com.garethabrahams.model.Staff.StaffAddress;
import com.garethabrahams.repository.Staff.Impl.StaffAddressRepositoryImpl;
import com.garethabrahams.repository.Staff.StaffAddressRepository;
import com.garethabrahams.service.Staff.StaffAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("StaffAddressService")
public class StaffAddressServiceImpl implements StaffAddressService {

    private static StaffAddressService service = null;

    @Autowired
    @Qualifier("StaffAddressRepository")
    private StaffAddressRepository repository;

    private StaffAddressServiceImpl(){

        repository = StaffAddressRepositoryImpl.getRepository();
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
