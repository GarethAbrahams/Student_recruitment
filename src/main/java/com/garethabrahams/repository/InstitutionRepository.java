package com.garethabrahams.repository;

import com.garethabrahams.model.Institution;

import java.util.Set;

public interface InstitutionRepository extends IRepository<Institution, String>{
    Set<Institution> getAll();
}
