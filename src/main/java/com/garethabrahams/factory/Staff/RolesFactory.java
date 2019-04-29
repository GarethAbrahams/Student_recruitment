package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.Roles;

public class RolesFactory {
    public static Roles createRoles(String role){
        return new Roles.Builder()
                .role(role)
                .build();
    }
}
