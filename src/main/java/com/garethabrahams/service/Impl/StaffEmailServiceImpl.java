package com.garethabrahams.service.Impl;

import com.garethabrahams.model.StaffEmail;
import com.garethabrahams.repository.Impl.StaffEmailRepositoryImpl;
import com.garethabrahams.repository.StaffEmailRepository;
import com.garethabrahams.service.StaffEmailService;

import java.util.Set;

public class StaffEmailServiceImpl implements StaffEmailService {

    private static StaffEmailService service = null;
    private StaffEmailRepository repository;

    private StaffEmailServiceImpl(){

        this.repository = StaffEmailRepositoryImpl.getRepository();
    }

    public static StaffEmailService getStaffEmailService(){
        if (service==null)
            service = new StaffEmailServiceImpl();
        return service;
    }

    @Override
    public Set<StaffEmail> getAll() {
        return this.repository.getAll();
    }

    @Override
    public StaffEmail create(StaffEmail e) {
        return this.repository.create(e);
    }

    @Override
    public StaffEmail read(String s) {
        return this.repository.read(s);
    }

    @Override
    public StaffEmail update(StaffEmail e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
