package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantOutcome;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantOutcomeRepository extends IRepository <ApplicantOutcome,String> {
    Set<ApplicantOutcome> getAll();
}
