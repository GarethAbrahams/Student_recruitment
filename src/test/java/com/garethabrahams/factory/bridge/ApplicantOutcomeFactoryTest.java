package com.garethabrahams.factory.bridge;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.OutcomeFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.bridge.ApplicantOutcome;
import com.garethabrahams.model.Outcome;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantOutcomeFactoryTest {

    @Test
    public void createApplicantOutcome() {

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams", "1234567890");
        String appID = applicant.getApplicantID();
        Outcome result = OutcomeFactory.createOutcome("Passed");
        String resultId = result.getId();

        ApplicantOutcome results = ApplicantOutcomeFactory.createApplicantOutcome(appID,resultId);

        Assert.assertEquals(appID,results.getApplicantID());
    }
}