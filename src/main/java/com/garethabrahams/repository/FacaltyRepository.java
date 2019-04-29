package com.garethabrahams.repository;

import com.garethabrahams.model.Institution.Facalty;

import java.util.Set;

public interface FacaltyRepository extends IRepository<Facalty, String>{
    Set<Facalty> getAll();
}