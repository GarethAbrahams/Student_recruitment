package com.garethabrahams.repository;

import com.garethabrahams.model.StaffCity;

import java.util.Set;

public interface StaffCityRepository extends IRepository<StaffCity, String>{
    Set<StaffCity> getAll();
}
