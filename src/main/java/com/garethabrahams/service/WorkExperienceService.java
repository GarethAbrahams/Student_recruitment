package com.garethabrahams.service;

import com.garethabrahams.model.WorkExperience;

import java.util.Set;

public interface WorkExperienceService extends IService<WorkExperience, String> {

    Set<WorkExperience> getAll();
}
