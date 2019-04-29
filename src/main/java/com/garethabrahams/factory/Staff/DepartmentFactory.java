package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.Department;

public class DepartmentFactory {
    public static Department createDepartment(String department){
        return new Department.Builder()
                .department(department)
                .build();
    }
}
