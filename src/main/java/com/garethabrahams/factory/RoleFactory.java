package com.garethabrahams.factory;

import com.garethabrahams.model.Role;
import com.garethabrahams.util.IDGenerator;

public class RoleFactory {

    public static Role createRole(String role){
        String id = IDGenerator.generateID();

        return new Role.Builder()
                .roleID(id)
                .role(role)
                .build();
    }
}
