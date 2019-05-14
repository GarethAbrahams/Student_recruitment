package com.garethabrahams.service;

import com.garethabrahams.model.Facalty;

import java.util.Set;

public interface FacaltyService extends IService<Facalty,String> {
    Set<Facalty> getAll();
}
