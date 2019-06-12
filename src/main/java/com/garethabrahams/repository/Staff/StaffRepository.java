package com.garethabrahams.repository.Staff;

import com.garethabrahams.model.Staff.Staff;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface StaffRepository extends IRepository<Staff, String> {
    Set<Staff> getAll();
}
