package com.garethabrahams.repository.Impl;

import com.garethabrahams.model.StaffEmail;
import com.garethabrahams.repository.StaffEmailRepository;

import java.util.HashSet;
import java.util.Set;

public class StaffEmailRepositoryImpl implements StaffEmailRepository {

    private static StaffEmailRepositoryImpl repository = null;
    private Set<StaffEmail> emailSet;

    //HashSet - Store in memory
    private StaffEmailRepositoryImpl() {

        this.emailSet = new HashSet<>();
    }

    public static StaffEmailRepositoryImpl getRepository(){
        if(repository==null)
            repository = new StaffEmailRepositoryImpl();

        return repository;
    }

    public StaffEmail emailSearch(final String email){
        for (StaffEmail staffEmail: this.emailSet){
            if (staffEmail.getEmail().equals(email))
                return staffEmail;
        }
        return null;
    }

    @Override
    public Set<StaffEmail> getAll() {
        return this.emailSet;
    }

    @Override
    public StaffEmail create(StaffEmail e) {
        this.emailSet.add(e);
        return e;
    }

    @Override
    public StaffEmail update(StaffEmail e) {
        StaffEmail emailOld = emailSearch(e.getEmail());
        if (emailOld != null){
            StaffEmail emailNew = new StaffEmail.Builder()
                    .copy(e)
                    .build();
            return create(emailNew);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.emailSet.remove(s);
    }

    @Override
    public StaffEmail read(String s) {
        return emailSearch(s);
    }
}
