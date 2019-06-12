package com.garethabrahams.service.General.Impl;

import com.garethabrahams.model.General.Password;
import com.garethabrahams.repository.General.Impl.PasswordRepositoryImpl;
import com.garethabrahams.repository.General.PasswordRepository;
import com.garethabrahams.service.General.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("PasswordService")
public class PasswordServiceImpl implements PasswordService {

    private static PasswordService service = null;

    @Autowired
    @Qualifier("PasswordRepository")
    private PasswordRepository repository;

    private PasswordServiceImpl(){

        repository = PasswordRepositoryImpl.getRepository();
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
