package com.garethabrahams.service.General.Impl;

import com.garethabrahams.model.General.Username;
import com.garethabrahams.repository.General.Impl.UsernameRepositoryImpl;
import com.garethabrahams.repository.General.UsernameRepository;
import com.garethabrahams.service.General.UsernameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("UsernameService")
public class UsernameServiceImpl implements UsernameService {

    private static UsernameService service = null;

    @Autowired
    @Qualifier("UsernameRepository")
    private UsernameRepository repository;

    private UsernameServiceImpl(){

        repository = UsernameRepositoryImpl.getRepository();
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
