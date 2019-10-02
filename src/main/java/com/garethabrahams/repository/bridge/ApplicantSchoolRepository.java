package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantRole;
import com.garethabrahams.model.bridge.ApplicantSchool;
import com.garethabrahams.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ApplicantSchoolRepository extends JpaRepository<ApplicantSchool,String> {

}
