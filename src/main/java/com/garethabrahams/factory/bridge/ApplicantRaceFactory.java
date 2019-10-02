package com.garethabrahams.factory.bridge;

import com.garethabrahams.model.bridge.ApplicantRace;

public class ApplicantRaceFactory {

    public static ApplicantRace createApplicantRace(String appID, String raceID){
        return new ApplicantRace.Builder()
                .applicantID(appID)
                .raceID(raceID)
                .build();
    }
}
