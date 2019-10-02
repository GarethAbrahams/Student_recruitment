package com.garethabrahams.repository.impl;

import com.garethabrahams.model.Role;
import com.garethabrahams.model.School;
import com.garethabrahams.repository.RoleRepository;
import com.garethabrahams.repository.SchoolRepository;

import java.util.HashSet;
import java.util.Set;

public class SchoolRepositoryImpl implements SchoolRepository {

    private static SchoolRepositoryImpl repository = null;
    private Set<School> schoolSet;

    private SchoolRepositoryImpl(){
        this.schoolSet = new HashSet<>();
    }

    public static SchoolRepositoryImpl getRepository(){
        if (repository==null)
            repository = new SchoolRepositoryImpl();

        return repository;
    }

    @Override
    public Set<School> getAll() {
        return this.schoolSet;
    }

    @Override
    public School create(School e) {
        this.schoolSet.add(e);
        return e;
    }

    @Override
    public School update(School e) {
        School oldResult = read(e.getSchoolID());
        if(oldResult != null) {
            delete(oldResult.getSchoolID());
            create(e);
            return e;
        }
        return null;
    }

    @Override
    public void delete(String e) {
        School result = read(e);
        this.schoolSet.remove(result);
    }

    @Override
    public School read(String e) {
        for (School result : this.schoolSet){
            if (result.getSchoolID().equals(e))
                return result;
        }
        return null;
    }
}
