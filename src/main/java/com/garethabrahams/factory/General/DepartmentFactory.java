package com.garethabrahams.factory.General;

import com.garethabrahams.model.General.Department;

public class DepartmentFactory {
    public static Department createDepartment(String department){
        return new Department.Builder()
                .department(department)
                .build();
    }
}
