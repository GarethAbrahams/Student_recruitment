package com.garethabrahams.repository.Staff;

import com.garethabrahams.model.Staff.StaffEmail;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface StaffEmailRepository extends IRepository<StaffEmail, String> {
    Set<StaffEmail> getAll();
}
