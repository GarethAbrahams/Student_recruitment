package com.garethabrahams.service.Impl;

import com.garethabrahams.model.Password;
import com.garethabrahams.repository.Impl.PasswordRepositoryImpl;
import com.garethabrahams.repository.PasswordRepository;
import com.garethabrahams.service.PasswordService;

import java.util.Set;

public class PasswordServiceImpl implements PasswordService {

    private static PasswordService service = null;
    private PasswordRepository repository;

    private PasswordServiceImpl(){

        this.repository = PasswordRepositoryImpl.getRepository();
    }

    public static PasswordService getPasswordService(){
        if (service==null)
            service = new PasswordServiceImpl();
        return service;
    }

    @Override
    public Set<Password> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Password create(Password e) {
        return this.repository.create(e);
    }

    @Override
    public Password read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Password update(Password e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
