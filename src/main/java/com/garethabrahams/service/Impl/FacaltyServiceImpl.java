package com.garethabrahams.service.Impl;

import com.garethabrahams.model.Facalty;
import com.garethabrahams.repository.FacaltyRepository;
import com.garethabrahams.repository.Impl.FacaltyRepositoryImpl;
import com.garethabrahams.service.FacaltyService;

import java.util.Set;

public class FacaltyServiceImpl implements FacaltyService {

    private static FacaltyService service = null;
    private FacaltyRepository repository;

    private FacaltyServiceImpl(){

        this.repository = FacaltyRepositoryImpl.getRepository();
    }

    public static FacaltyService getFacaltyService(){
        if (service==null)
            service = new FacaltyServiceImpl();
        return service;
    }

    @Override
    public Set<Facalty> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Facalty create(Facalty e) {
        return this.repository.create(e);
    }

    @Override
    public Facalty read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Facalty update(Facalty e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
