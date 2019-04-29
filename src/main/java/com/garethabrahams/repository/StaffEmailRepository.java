package com.garethabrahams.repository;

import com.garethabrahams.model.Staff.StaffEmail;

import java.util.Set;

public interface StaffEmailRepository extends IRepository<StaffEmail, String>{
    Set<StaffEmail> getAll();
}
