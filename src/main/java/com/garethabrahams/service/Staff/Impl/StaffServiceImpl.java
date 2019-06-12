package com.garethabrahams.service.Staff.Impl;

import com.garethabrahams.model.Staff.Staff;
import com.garethabrahams.repository.Staff.Impl.StaffRepositoryImpl;
import com.garethabrahams.repository.Staff.StaffRepository;
import com.garethabrahams.service.Staff.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("StaffService")
public class StaffServiceImpl implements StaffService {

    private static StaffService service = null;

    @Autowired
    @Qualifier("StaffRepository")
    private StaffRepository repository;

    private StaffServiceImpl(){

        repository = StaffRepositoryImpl.getRepository();
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
