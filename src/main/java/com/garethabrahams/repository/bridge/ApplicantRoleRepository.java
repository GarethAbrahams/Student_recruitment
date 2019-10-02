package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantRace;
import com.garethabrahams.model.bridge.ApplicantRole;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantRoleRepository extends IRepository <ApplicantRole,String> {
    Set<ApplicantRole> getAll();
}
