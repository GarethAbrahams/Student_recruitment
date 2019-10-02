package com.garethabrahams.repository.impl;

import com.garethabrahams.model.School;
import com.garethabrahams.model.UserDetails;
import com.garethabrahams.repository.SchoolRepository;
import com.garethabrahams.repository.UserDetailsRepository;

import java.util.HashSet;
import java.util.Set;

public class UserDetailsRepositoryImpl implements UserDetailsRepository {

    private static UserDetailsRepositoryImpl repository = null;
    private Set<UserDetails> userDetailsSet;

    private UserDetailsRepositoryImpl(){
        this.userDetailsSet = new HashSet<>();
    }

    public static UserDetailsRepositoryImpl getRepository(){
        if (repository==null)
            repository = new UserDetailsRepositoryImpl();

        return repository;
    }

    @Override
    public Set<UserDetails> getAll() {
        return this.userDetailsSet;
    }

    @Override
    public UserDetails create(UserDetails e) {
        this.userDetailsSet.add(e);
        return e;
    }

    @Override
    public UserDetails update(UserDetails e) {
        UserDetails oldResult = read(e.getUsername());
        if(oldResult != null) {
            delete(oldResult.getUsername());
            create(e);
            return e;
        }
        return null;
    }

    @Override
    public void delete(String e) {
        UserDetails result = read(e);
        this.userDetailsSet.remove(result);
    }

    @Override
    public UserDetails read(String e) {
        for (UserDetails result : this.userDetailsSet){
            if (result.getUsername().equals(e))
                return result;
        }
        return null;
    }
}
