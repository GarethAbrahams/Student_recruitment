package com.garethabrahams.service.General;

import com.garethabrahams.model.General.Roles;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface RolesService extends IService<Roles, String> {
    Set<Roles> getAll();
}
