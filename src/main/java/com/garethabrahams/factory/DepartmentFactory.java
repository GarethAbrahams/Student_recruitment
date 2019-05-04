package com.garethabrahams.factory;

import com.garethabrahams.model.Department;

public class DepartmentFactory {
    public static Department createDepartment(String department){
        return new Department.Builder()
                .department(department)
                .build();
    }
}
