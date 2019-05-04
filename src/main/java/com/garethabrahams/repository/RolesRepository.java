package com.garethabrahams.repository;

import com.garethabrahams.model.Roles;

import java.util.Set;

public interface RolesRepository extends IRepository<Roles, String> {
    Set<Roles> getAll();
}
