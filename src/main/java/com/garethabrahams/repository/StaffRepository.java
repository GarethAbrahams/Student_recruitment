package com.garethabrahams.repository;

import com.garethabrahams.model.Staff.Staff;

import java.util.Set;

public interface StaffRepository extends IRepository<Staff, String> {
    Set<Staff> getAll();
}
