package com.garethabrahams.service;

import com.garethabrahams.model.StaffCity;

import java.util.Set;

public interface StaffCityService extends IService<StaffCity,String> {
    Set<StaffCity> getAll();
}
