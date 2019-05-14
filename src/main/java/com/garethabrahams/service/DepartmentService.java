package com.garethabrahams.service;

import com.garethabrahams.model.Department;

import java.util.Set;

public interface DepartmentService extends IService<Department, String> {
    Set<Department> getAll();
}
