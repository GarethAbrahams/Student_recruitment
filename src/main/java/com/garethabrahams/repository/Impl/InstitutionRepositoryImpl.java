package com.garethabrahams.repository.Impl;

import com.garethabrahams.model.Institution;
import com.garethabrahams.repository.InstitutionRepository;

import java.util.HashSet;
import java.util.Set;

public class InstitutionRepositoryImpl implements InstitutionRepository {

    private static InstitutionRepositoryImpl repository = null;
    private Set<Institution> institutions;

    //HashSet - Store in memory
    private InstitutionRepositoryImpl() {

        this.institutions = new HashSet<>();
    }

    public static InstitutionRepositoryImpl getRepository(){
        if(repository==null)
            repository = new InstitutionRepositoryImpl();

        return repository;
    }

    public Institution institutionSearch(final String i){
        for (Institution institution: this.institutions){
            if (institution.getInstitutionName().equals(i))
                return institution;
        }
        return null;
    }

    @Override
    public Set<Institution> getAll() {
        return this.institutions;
    }

    @Override
    public Institution create(Institution institution) {
        this.institutions.add(institution);
        return institution;
    }

    @Override
    public Institution update(Institution i) {
        Institution institutionOld = institutionSearch(i.getInstitutionName());
        if (institutionOld != null){
            Institution institutionNew = new Institution.Builder()
                    .copy(i)
                    .build();
            return create(institutionNew);
        }
        return null;
    }

    @Override
    public void delete(String s) {
        this.institutions.remove(s);
    }

    @Override
    public Institution read(String s) {
        return institutionSearch(s);
    }
}
