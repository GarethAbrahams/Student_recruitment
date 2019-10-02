package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantUserDetails;
import com.garethabrahams.model.bridge.ApplicantWorkExperience;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantWorkExperienceRepository extends IRepository <ApplicantWorkExperience,String> {
    Set<ApplicantWorkExperience> getAll();
}
