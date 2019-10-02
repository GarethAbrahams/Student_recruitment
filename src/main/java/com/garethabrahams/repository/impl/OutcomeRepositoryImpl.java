package com.garethabrahams.repository.impl;

import com.garethabrahams.model.Gender;
import com.garethabrahams.model.Outcome;
import com.garethabrahams.repository.GenderRepository;
import com.garethabrahams.repository.OutcomeRepository;

import java.util.HashSet;
import java.util.Set;

public class OutcomeRepositoryImpl implements OutcomeRepository {

    private static OutcomeRepositoryImpl repository = null;
    private Set<Outcome> outcomeSet;

    private OutcomeRepositoryImpl(){
        this.outcomeSet = new HashSet<>();
    }

    public static OutcomeRepositoryImpl getRepository(){
        if (repository==null)
            repository = new OutcomeRepositoryImpl();

        return repository;
    }

    @Override
    public Set<Outcome> getAll() {
        return this.outcomeSet;
    }

    @Override
    public Outcome create(Outcome e) {
        this.outcomeSet.add(e);
        return e;
    }

    @Override
    public Outcome update(Outcome e) {
        Outcome oldResult = read(e.getId());
        if(oldResult != null) {
            delete(oldResult.getId());
            create(e);
            return e;
        }
        return null;
    }

    @Override
    public void delete(String e) {
        Outcome result = read(e);
        this.outcomeSet.remove(result);
    }

    @Override
    public Outcome read(String e) {
        for (Outcome result : this.outcomeSet){
            if (result.getId().equals(e))
                return result;
        }
        return null;
    }
}
