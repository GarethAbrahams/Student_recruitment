package com.garethabrahams.service.Staff;

import com.garethabrahams.model.Staff.Staff;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface StaffService extends IService<Staff, String> {
    Set<Staff> getAll();
}
