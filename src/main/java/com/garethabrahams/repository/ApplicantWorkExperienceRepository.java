package com.garethabrahams.repository;

import com.garethabrahams.model.Applicant.ApplicantWorkExperience;

import java.util.Set;

public interface ApplicantWorkExperienceRepository extends IRepository<ApplicantWorkExperience, String> {
    Set<ApplicantWorkExperience> getAll();

}
