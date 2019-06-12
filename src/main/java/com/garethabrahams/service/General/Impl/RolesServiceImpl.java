package com.garethabrahams.service.General.Impl;

import com.garethabrahams.model.General.Roles;
import com.garethabrahams.repository.General.Impl.RolesRepositoryImpl;
import com.garethabrahams.repository.General.RolesRepository;
import com.garethabrahams.service.General.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("RolesService")
public class RolesServiceImpl implements RolesService {

    private static RolesService service = null;

    @Autowired
    @Qualifier("RolesRepository")
    private RolesRepository repository;

    private RolesServiceImpl(){

        repository = RolesRepositoryImpl.getRepository();
    }

    public static RolesService getRolesService(){
        if (service==null)
            service = new RolesServiceImpl();
        return service;
    }

    @Override
    public Set<Roles> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Roles create(Roles e) {
        return this.repository.create(e);
    }

    @Override
    public Roles read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Roles update(Roles e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
