package com.garethabrahams.repository.Applicant;

import com.garethabrahams.model.Applicant.Applicant;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantRepository extends IRepository<Applicant, String> {
        Set<Applicant> getAll();
}
