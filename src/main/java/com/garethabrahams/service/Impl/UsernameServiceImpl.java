package com.garethabrahams.service.Impl;

import com.garethabrahams.model.Username;
import com.garethabrahams.repository.Impl.UsernameRepositoryImpl;
import com.garethabrahams.repository.UsernameRepository;
import com.garethabrahams.service.UsernameService;

import java.util.Set;

public class UsernameServiceImpl implements UsernameService {

    private static UsernameService service = null;
    private UsernameRepository repository;

    private UsernameServiceImpl(){

        this.repository = UsernameRepositoryImpl.getRepository();
    }

    public static UsernameService getUsernameService(){
        if (service==null)
            service = new UsernameServiceImpl();
        return service;
    }

    @Override
    public Set<Username> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Username create(Username e) {
        return this.repository.create(e);
    }

    @Override
    public Username read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Username update(Username e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
