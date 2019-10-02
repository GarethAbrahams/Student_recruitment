package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantRace;
import com.garethabrahams.model.bridge.ApplicantRole;
import com.garethabrahams.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ApplicantRoleRepository extends JpaRepository<ApplicantRole,String> {

}
