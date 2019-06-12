package com.garethabrahams.service.Staff.Impl;

import com.garethabrahams.model.Staff.StaffContact;
import com.garethabrahams.repository.Staff.Impl.StaffContactRepositoryImpl;
import com.garethabrahams.repository.Staff.StaffContactRepository;
import com.garethabrahams.service.Staff.StaffContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("StaffContactService")
public class StaffContactServiceImpl implements StaffContactService {

    private static StaffContactService service = null;

    @Autowired
    @Qualifier("StaffContactRepository")
    private StaffContactRepository repository;

    private StaffContactServiceImpl(){

        repository = StaffContactRepositoryImpl.getRepository();
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
