package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.OutcomeFactory;
import com.garethabrahams.factory.bridge.ApplicantOutcomeFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.Outcome;
import com.garethabrahams.model.bridge.ApplicantOutcome;
import com.garethabrahams.repository.bridge.ApplicantOutcomeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantOutcomeRepositoryImplTest {

    private static ApplicantOutcomeRepository repository;
    private static ApplicantOutcome appOutcome;
    private String applicantID;

    @Before
    @Test
    public void create() {
        repository = ApplicantOutcomeRepositoryImpl.getRepository();

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams","1234567890");
        Outcome outcome = OutcomeFactory.createOutcome("Failed");
        appOutcome = ApplicantOutcomeFactory.createApplicantOutcome(applicant.getApplicantID(),outcome.getId());
        applicantID = applicant.getApplicantID();
        ApplicantOutcome result = repository.create(appOutcome);
        Assert.assertEquals(applicantID,result.getApplicantID());
    }

    @Test
    public void read() {
        ApplicantOutcome result = repository.read(applicantID);
        Assert.assertEquals(applicantID,result.getApplicantID());

    }

    @Test
    public void update() {
        ApplicantOutcome result = repository.read(applicantID);
        Outcome newResult = OutcomeFactory.createOutcome("Passed");
        String newID = newResult.getId();
        ApplicantOutcome update = new ApplicantOutcome.Builder().copy(result).outcomeID(newID).build();
        ApplicantOutcome newRead = repository.update(update);

        Assert.assertEquals(applicantID,newRead.getApplicantID());
        Assert.assertEquals(newID,newRead.getOutcomeID());

    }

    @Test
    public void delete() {
        ApplicantOutcome result = repository.read(applicantID);
        repository.delete(applicantID);
        ApplicantOutcome newResult = repository.read(applicantID);
        Assert.assertNull(newResult);
    }

    @Test
    public void getAll() {
        Set<ApplicantOutcome> result = repository.getAll();
        Assert.assertNotNull(result);
    }
}