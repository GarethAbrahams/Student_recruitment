package com.garethabrahams.service.bridge;

import com.garethabrahams.model.bridge.ApplicantWorkExperience;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantWorkExperienceService extends IService<ApplicantWorkExperience, String> {

    Set<ApplicantWorkExperience> getAll();
}
