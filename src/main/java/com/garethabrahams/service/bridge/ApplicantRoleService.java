package com.garethabrahams.service.bridge;

import com.garethabrahams.model.bridge.ApplicantRole;
import com.garethabrahams.service.IService;

import java.util.List;
import java.util.Set;

public interface ApplicantRoleService extends IService<ApplicantRole, String> {

    List<ApplicantRole> getAll();
}
