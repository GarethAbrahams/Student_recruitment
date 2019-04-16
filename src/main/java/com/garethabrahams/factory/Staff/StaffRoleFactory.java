package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.StaffRole;

public class StaffRoleFactory {
    public static StaffRole creatStudentRole(String role) {
        return new StaffRole.Builder()
                .role(role)
                .build();
    }
}
