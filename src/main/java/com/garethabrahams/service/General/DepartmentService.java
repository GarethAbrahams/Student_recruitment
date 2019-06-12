package com.garethabrahams.service.General;

import com.garethabrahams.model.General.Department;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface DepartmentService extends IService<Department, String> {
    Set<Department> getAll();
}
