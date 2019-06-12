package com.garethabrahams.repository.Staff;

import com.garethabrahams.model.Staff.StaffCity;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface StaffCityRepository extends IRepository<StaffCity, String> {
    Set<StaffCity> getAll();
}
