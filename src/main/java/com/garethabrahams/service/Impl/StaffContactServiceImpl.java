package com.garethabrahams.service.Impl;

import com.garethabrahams.model.StaffContact;
import com.garethabrahams.repository.Impl.StaffContactRepositoryImpl;
import com.garethabrahams.repository.StaffContactRepository;
import com.garethabrahams.service.StaffContactService;

import java.util.Set;

public class StaffContactServiceImpl implements StaffContactService {

    private static StaffContactService service = null;
    private StaffContactRepository repository;

    private StaffContactServiceImpl(){

        this.repository = StaffContactRepositoryImpl.getRepository();
    }

    public static StaffContactService getStaffContactService(){
        if (service==null)
            service = new StaffContactServiceImpl();
        return service;
    }

    @Override
    public Set<StaffContact> getAll() {
        return this.repository.getAll();
    }

    @Override
    public StaffContact create(StaffContact e) {
        return this.repository.create(e);
    }

    @Override
    public StaffContact read(String s) {
        return this.repository.read(s);
    }

    @Override
    public StaffContact update(StaffContact e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
