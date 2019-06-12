package com.garethabrahams.repository.General;

import com.garethabrahams.model.General.Institution;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface InstitutionRepository extends IRepository<Institution, String> {
    Set<Institution> getAll();
}
