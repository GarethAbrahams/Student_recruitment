package com.garethabrahams.service.bridge;

import com.garethabrahams.model.bridge.ApplicantRole;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantRoleService extends IService<ApplicantRole, String> {

    Set<ApplicantRole> getAll();
}
