package com.garethabrahams.service.General.Impl;

import com.garethabrahams.model.General.Institution;
import com.garethabrahams.repository.General.Impl.InstitutionRepositoryImpl;
import com.garethabrahams.repository.General.InstitutionRepository;
import com.garethabrahams.service.General.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("InstitutionService")
public class InstitutionServiceImpl implements InstitutionService {

    private static InstitutionService service = null;

    @Autowired
    @Qualifier("InstitutionRepository")
    private InstitutionRepository repository;

    private InstitutionServiceImpl(){

        repository = InstitutionRepositoryImpl.getRepository();
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
