package com.garethabrahams.repository;

import com.garethabrahams.model.Staff.Department;

import java.util.Set;

public interface DepartmentRepository extends IRepository<Department, String> {
    Set<Department> getAll();
}
