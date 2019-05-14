package com.garethabrahams.service;

import com.garethabrahams.model.Roles;

import java.util.Set;

public interface RolesService extends IService<Roles, String> {
    Set<Roles> getAll();
}
