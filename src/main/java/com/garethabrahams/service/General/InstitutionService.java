package com.garethabrahams.service.General;

import com.garethabrahams.model.General.Institution;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface InstitutionService extends IService<Institution,String> {
    Set<Institution> getAll();
}
