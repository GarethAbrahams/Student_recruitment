package com.garethabrahams.repository.General;

import com.garethabrahams.model.General.Facalty;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface FacaltyRepository extends IRepository<Facalty, String> {
    Set<Facalty> getAll();
}
