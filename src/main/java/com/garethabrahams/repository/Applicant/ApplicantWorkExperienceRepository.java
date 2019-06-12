package com.garethabrahams.repository.Applicant;

import com.garethabrahams.model.Applicant.ApplicantWorkExperience;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantWorkExperienceRepository extends IRepository<ApplicantWorkExperience, String> {
    Set<ApplicantWorkExperience> getAll();

}
