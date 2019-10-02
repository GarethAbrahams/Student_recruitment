package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantSchool;
import com.garethabrahams.model.bridge.ApplicantUserDetails;
import com.garethabrahams.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ApplicantUserDetailsRepository extends JpaRepository<ApplicantUserDetails,String> {

}
