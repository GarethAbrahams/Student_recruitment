package com.garethabrahams.service.bridge;

import com.garethabrahams.model.bridge.ApplicantOutcome;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantOutcomeService extends IService<ApplicantOutcome, String> {

    Set<ApplicantOutcome> getAll();
}
