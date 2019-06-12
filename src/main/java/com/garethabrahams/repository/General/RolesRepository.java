package com.garethabrahams.repository.General;

import com.garethabrahams.model.General.Roles;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface RolesRepository extends IRepository<Roles, String> {
    Set<Roles> getAll();
}
