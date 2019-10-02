package com.garethabrahams.repository.impl;

import com.garethabrahams.model.Race;
import com.garethabrahams.model.Role;
import com.garethabrahams.repository.RaceRepository;
import com.garethabrahams.repository.RoleRepository;

import java.util.HashSet;
import java.util.Set;

public class RoleRepositoryImpl implements RoleRepository {

    private static RoleRepositoryImpl repository = null;
    private Set<Role> roleSet;

    private RoleRepositoryImpl(){
        this.roleSet = new HashSet<>();
    }

    public static RoleRepositoryImpl getRepository(){
        if (repository==null)
            repository = new RoleRepositoryImpl();

        return repository;
    }

    @Override
    public Set<Role> getAll() {
        return this.roleSet;
    }

    @Override
    public Role create(Role e) {
        this.roleSet.add(e);
        return e;
    }

    @Override
    public Role update(Role e) {
        Role oldResult = read(e.getRoleID());
        if(oldResult != null) {
            delete(oldResult.getRoleID());
            create(e);
            return e;
        }
        return null;
    }

    @Override
    public void delete(String e) {
        Role result = read(e);
        this.roleSet.remove(result);
    }

    @Override
    public Role read(String e) {
        for (Role result : this.roleSet){
            if (result.getRoleID().equals(e))
                return result;
        }
        return null;
    }
}
