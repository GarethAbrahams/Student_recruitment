package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.RaceFactory;
import com.garethabrahams.factory.bridge.ApplicantRaceFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.Race;
import com.garethabrahams.model.bridge.ApplicantRace;
import com.garethabrahams.repository.bridge.ApplicantRaceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantRaceRepositoryImplTest {

    private static ApplicantRaceRepository repository;
    private static ApplicantRace appRace;
    private String applicantID;

    @Before
    @Test
    public void create() {
        repository = ApplicantRaceRepositoryImpl.getRepository();

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams","1234567890");
        Race race = RaceFactory.createRace("Coloured");
        appRace = ApplicantRaceFactory.createApplicantRace(applicant.getApplicantID(),race.getId());
        applicantID = applicant.getApplicantID();
        ApplicantRace result = repository.create(appRace);
        Assert.assertEquals(applicantID,result.getApplicantID());
    }

    @Test
    public void read() {
        ApplicantRace result = repository.read(applicantID);
        Assert.assertEquals(applicantID,result.getApplicantID());

    }

    @Test
    public void update() {
        ApplicantRace result = repository.read(applicantID);
        Race newResult = RaceFactory.createRace("Black");
        String newID = newResult.getId();
        ApplicantRace update = new ApplicantRace.Builder().copy(result).raceID(newID).build();
        ApplicantRace newRead = repository.update(update);

        Assert.assertEquals(applicantID,newRead.getApplicantID());
        Assert.assertEquals(newID,newRead.getRaceID());

    }

    @Test
    public void delete() {
        ApplicantRace result = repository.read(applicantID);
        repository.delete(applicantID);
        ApplicantRace newResult = repository.read(applicantID);
        Assert.assertNull(newResult);
    }

    @Test
    public void getAll() {
        Set<ApplicantRace> result = repository.getAll();
        Assert.assertNotNull(result);
    }
}