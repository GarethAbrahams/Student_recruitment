package com.garethabrahams.factory.General;

import com.garethabrahams.model.General.Roles;

public class RolesFactory {
    public static Roles createRoles(String role){
        return new Roles.Builder()
                .role(role)
                .build();
    }
}
