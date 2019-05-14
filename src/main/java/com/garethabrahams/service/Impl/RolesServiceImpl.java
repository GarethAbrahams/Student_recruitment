package com.garethabrahams.service.Impl;

import com.garethabrahams.model.Roles;
import com.garethabrahams.repository.Impl.RolesRepositoryImpl;
import com.garethabrahams.repository.RolesRepository;
import com.garethabrahams.service.RolesService;

import java.util.Set;

public class RolesServiceImpl implements RolesService {

    private static RolesService service = null;
    private RolesRepository repository;

    private RolesServiceImpl(){

        this.repository = RolesRepositoryImpl.getRepository();
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
