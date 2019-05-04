package com.garethabrahams.factory;

import com.garethabrahams.model.Roles;

public class RolesFactory {
    public static Roles createRoles(String role){
        return new Roles.Builder()
                .role(role)
                .build();
    }
}
