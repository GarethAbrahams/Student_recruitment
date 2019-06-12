package com.garethabrahams.service.Staff.Impl;

import com.garethabrahams.model.Staff.StaffCity;
import com.garethabrahams.repository.Staff.Impl.StaffCityRepositoryImpl;
import com.garethabrahams.repository.Staff.StaffCityRepository;
import com.garethabrahams.service.Staff.StaffCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("StaffCityService")
public class StaffCityServiceImpl implements StaffCityService {

    private static StaffCityService service = null;

    @Autowired
    @Qualifier("StaffCityRepository")
    private StaffCityRepository repository;

    private StaffCityServiceImpl(){

        repository = StaffCityRepositoryImpl.getRepository();
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
