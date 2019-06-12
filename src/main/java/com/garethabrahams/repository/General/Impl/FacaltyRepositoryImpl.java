package com.garethabrahams.repository.General.Impl;

import com.garethabrahams.model.General.Facalty;
import com.garethabrahams.repository.General.FacaltyRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("FacaltyRepository")
public class FacaltyRepositoryImpl implements FacaltyRepository {

    private static FacaltyRepositoryImpl repository = null;
    private Set<Facalty> facalties;

    //HashSet - Store in memory
    private FacaltyRepositoryImpl() {

        this.facalties = new HashSet<>();
    }

    public static FacaltyRepositoryImpl getRepository(){
        if(repository==null)
            repository = new FacaltyRepositoryImpl();

        return repository;
    }

    public Facalty facaltySearch(final String f){
        for (Facalty facalty: this.facalties){
            if (facalty.getFacaltyName().equals(f))
                return facalty;
        }
        return null;
    }

    @Override
    public Set<Facalty> getAll() {
        return this.facalties;
    }

    @Override
    public Facalty create(Facalty f) {
        this.facalties.add(f);
        return f;
    }

    @Override
    public Facalty update(Facalty e) {
        Facalty facaltyOld = facaltySearch(e.getFacaltyName());
        if (facaltyOld != null){
            Facalty facaltyNew = new Facalty.Builder()
                    .copy(e)
                    .build();
            return create(facaltyNew);
        }
        return null;
    }

    @Override
    public void delete(String f) {
        this.facalties.remove(f);
    }

    @Override
    public Facalty read(String s) {
        return facaltySearch(s);
    }
}
