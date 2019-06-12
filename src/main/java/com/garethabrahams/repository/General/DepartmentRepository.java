package com.garethabrahams.repository.General;

import com.garethabrahams.model.General.Department;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface DepartmentRepository extends IRepository<Department, String> {
    Set<Department> getAll();
}
