package com.garethabrahams.service.Staff;

import com.garethabrahams.model.Staff.StaffCity;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface StaffCityService extends IService<StaffCity,String> {
    Set<StaffCity> getAll();
}
