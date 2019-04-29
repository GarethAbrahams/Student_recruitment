package com.garethabrahams.repository;

import com.garethabrahams.model.Staff.StaffCity;

import java.util.Set;

public interface StaffCityRepository extends IRepository<StaffCity, String>{
    Set<StaffCity> getAll();
}
