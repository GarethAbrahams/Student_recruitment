package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantUserDetails;
import com.garethabrahams.model.bridge.ApplicantWorkExperience;
import com.garethabrahams.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ApplicantWorkExperienceRepository extends JpaRepository<ApplicantWorkExperience,String> {

}
