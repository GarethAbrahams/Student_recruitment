package com.garethabrahams.repository.General.Impl;

import com.garethabrahams.model.General.Roles;
import com.garethabrahams.repository.General.RolesRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("RolesRepository")
public class RolesRepositoryImpl implements RolesRepository {
    private static RolesRepositoryImpl repository = null;
    private Set<Roles> roles;

    //HashSet - Store in memory
    private RolesRepositoryImpl() {

        this.roles = new HashSet<>();
    }

    public static RolesRepositoryImpl getRepository(){
        if(repository==null)
            repository = new RolesRepositoryImpl();

        return repository;
    }

    public Roles roleSearch(final String r){
        for (Roles role: this.roles){
            if (role.getRole().equals(r))
                return role;
        }
        return null;
    }

    @Override
    public Set<Roles> getAll() {
        return this.roles;
    }

    @Override
    public Roles create(Roles e) {
        this.roles.add(e);
        return e;
    }

    @Override
    public Roles update(Roles e) {
        Roles roleOld = roleSearch(e.getRole());
        if (roleOld != null){
            Roles roleNew = new Roles.Builder()
                    .copy(e)
                    .build();
            return create(roleNew);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.roles.remove(s);
    }

    @Override
    public Roles read(String s) {
        return roleSearch(s);
    }
}
