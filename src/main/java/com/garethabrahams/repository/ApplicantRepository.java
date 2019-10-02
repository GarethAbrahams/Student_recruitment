package com.garethabrahams.repository;

import com.garethabrahams.model.Address;
import com.garethabrahams.model.Applicant;

import java.util.Set;

public interface ApplicantRepository extends IRepository <Applicant,String> {
    Set<Applicant> getAll();
}
