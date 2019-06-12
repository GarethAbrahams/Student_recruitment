package com.garethabrahams.service.General;

import com.garethabrahams.model.General.Facalty;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface FacaltyService extends IService<Facalty,String> {
    Set<Facalty> getAll();
}
