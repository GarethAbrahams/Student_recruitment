package com.garethabrahams.service.Applicant;

import com.garethabrahams.model.Applicant.ApplicantWorkExperience;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantWorkExperienceService extends IService<ApplicantWorkExperience, String> {
    Set<ApplicantWorkExperience> getAll();
}
