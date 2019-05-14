package com.garethabrahams.service.Impl;

import com.garethabrahams.model.StaffCity;
import com.garethabrahams.repository.Impl.StaffCityRepositoryImpl;
import com.garethabrahams.repository.StaffCityRepository;
import com.garethabrahams.service.StaffCityService;

import java.util.Set;

public class StaffCityServiceImpl implements StaffCityService {

    private static StaffCityService service = null;
    private StaffCityRepository repository;

    private StaffCityServiceImpl(){

        this.repository = StaffCityRepositoryImpl.getRepository();
    }

    public static StaffCityService getStaffCityService(){
        if (service==null)
            service = new StaffCityServiceImpl();
        return service;
    }

    @Override
    public Set<StaffCity> getAll() {
        return this.repository.getAll();
    }

    @Override
    public StaffCity create(StaffCity e) {
        return this.repository.create(e);
    }

    @Override
    public StaffCity read(String s) {
        return this.repository.read(s);
    }

    @Override
    public StaffCity update(StaffCity e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
