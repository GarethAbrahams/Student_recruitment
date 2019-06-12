package com.garethabrahams.service.Staff.Impl;

import com.garethabrahams.model.Staff.StaffEmail;
import com.garethabrahams.repository.Staff.Impl.StaffEmailRepositoryImpl;
import com.garethabrahams.repository.Staff.StaffEmailRepository;
import com.garethabrahams.service.Staff.StaffEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("StaffEmailService")
public class StaffEmailServiceImpl implements StaffEmailService {

    private static StaffEmailService service = null;

    @Autowired
    @Qualifier("StaffEmailRepository")
    private StaffEmailRepository repository;

    private StaffEmailServiceImpl(){

        repository = StaffEmailRepositoryImpl.getRepository();
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
