package com.garethabrahams.factory.bridge;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.RaceFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.bridge.ApplicantRace;
import com.garethabrahams.model.Race;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantRaceFactoryTest {

    @Test
    public void createApplicantRace() {

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams", "1234567890");
        String appID = applicant.getApplicantID();

        Race race = RaceFactory.createRace("Coloured");
        String raceID = race.getId();

        ApplicantRace result = ApplicantRaceFactory.createApplicantRace(appID,raceID);

        Assert.assertEquals(appID,result.getApplicantID());
    }
}