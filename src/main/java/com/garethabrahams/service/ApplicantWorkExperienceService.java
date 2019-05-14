package com.garethabrahams.service;

import com.garethabrahams.model.ApplicantWorkExperience;

import java.util.Set;

public interface ApplicantWorkExperienceService extends IService<ApplicantWorkExperience, String> {
    Set<ApplicantWorkExperience> getAll();
}
