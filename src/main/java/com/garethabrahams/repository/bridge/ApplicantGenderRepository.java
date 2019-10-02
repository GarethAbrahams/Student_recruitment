package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantGender;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantGenderRepository extends IRepository <ApplicantGender,String> {
    Set<ApplicantGender> getAll();
}
