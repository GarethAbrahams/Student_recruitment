package com.garethabrahams.service.Impl;

import com.garethabrahams.model.Institution;
import com.garethabrahams.repository.Impl.InstitutionRepositoryImpl;
import com.garethabrahams.repository.InstitutionRepository;
import com.garethabrahams.service.InstitutionService;

import java.util.Set;

public class InstitutionServiceImpl implements InstitutionService {

    private static InstitutionService service = null;
    private InstitutionRepository repository;

    private InstitutionServiceImpl(){

        this.repository = InstitutionRepositoryImpl.getRepository();
    }

    public static InstitutionService getInstitutionService(){
        if (service==null)
            service = new InstitutionServiceImpl();
        return service;
    }

    @Override
    public Set<Institution> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Institution create(Institution e) {
        return this.repository.create(e);
    }

    @Override
    public Institution read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Institution update(Institution e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
