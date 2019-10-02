package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantQualification;
import com.garethabrahams.model.bridge.ApplicantRace;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface ApplicantRaceRepository extends IRepository <ApplicantRace,String> {
    Set<ApplicantRace> getAll();
}
