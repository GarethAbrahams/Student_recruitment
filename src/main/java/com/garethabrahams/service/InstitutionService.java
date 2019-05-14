package com.garethabrahams.service;

import com.garethabrahams.model.Institution;

import java.util.Set;

public interface InstitutionService extends IService<Institution,String> {
    Set<Institution> getAll();
}
