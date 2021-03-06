package com.garethabrahams.service.bridge;

import com.garethabrahams.model.bridge.ApplicantRace;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface ApplicantRaceService extends IService<ApplicantRace, String> {

    Set<ApplicantRace> getAll();
}
