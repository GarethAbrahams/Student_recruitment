package com.garethabrahams.repository;
import com.garethabrahams.model.Role;

import java.util.Set;

public interface RoleRepository extends IRepository <Role, String> {
    Set<Role> getAll();
}
