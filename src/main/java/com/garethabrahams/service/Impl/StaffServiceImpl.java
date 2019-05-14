package com.garethabrahams.service.Impl;

import com.garethabrahams.model.Staff;
import com.garethabrahams.repository.Impl.StaffRepositoryImpl;
import com.garethabrahams.repository.StaffRepository;
import com.garethabrahams.service.StaffService;

import java.util.Set;

public class StaffServiceImpl implements StaffService {

    private static StaffService service = null;
    private StaffRepository repository;

    private StaffServiceImpl(){

        this.repository = StaffRepositoryImpl.getRepository();
    }

    public static StaffService getStaffService(){
        if (service==null)
            service = new StaffServiceImpl();
        return service;
    }

    @Override
    public Set<Staff> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Staff create(Staff e) {
        return this.repository.create(e);
    }

    @Override
    public Staff read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Staff update(Staff e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
