package com.garethabrahams.service;

import com.garethabrahams.model.WorkExperience;

import java.util.List;
import java.util.Set;

public interface WorkExperienceService extends IService<WorkExperience, String> {

    WorkExperience findByItem(String itemdesc);

    List<WorkExperience> getAll();
}
