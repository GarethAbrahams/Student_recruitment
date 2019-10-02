package com.garethabrahams.repository;
import com.garethabrahams.model.WorkExperience;

import java.util.Set;

public interface WorkExperienceRepository extends IRepository <WorkExperience, String> {
    Set<WorkExperience> getAll();
}
