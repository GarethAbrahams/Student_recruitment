package com.garethabrahams.service;

import com.garethabrahams.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService extends IService<Role, String> {

    Role findByItem(String itemdesc);

    List<Role> getAll();
}
