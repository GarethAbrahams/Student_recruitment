package com.garethabrahams.service;

import com.garethabrahams.model.Role;

import java.util.Set;

public interface RoleService extends IService<Role, String> {

    Set<Role> getAll();
}
