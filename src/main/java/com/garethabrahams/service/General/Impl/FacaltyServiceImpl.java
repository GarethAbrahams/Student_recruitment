package com.garethabrahams.service.General.Impl;

import com.garethabrahams.model.General.Facalty;
import com.garethabrahams.repository.General.FacaltyRepository;
import com.garethabrahams.repository.General.Impl.FacaltyRepositoryImpl;
import com.garethabrahams.service.General.FacaltyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("FacaltyService")
public class FacaltyServiceImpl implements FacaltyService {

    private static FacaltyService service = null;

    @Autowired
    @Qualifier("FacaltyRepository")
    private FacaltyRepository repository;

    private FacaltyServiceImpl(){

        repository = FacaltyRepositoryImpl.getRepository();
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
