package com.garethabrahams.factory;

import com.garethabrahams.model.Applicant;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicantFactoryTest {

    @Test
    public void createApplicant() {

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams", "1234567890");
        String id = applicant.getApplicantID();
        Assert.assertNotNull(applicant);
        Assert.assertEquals(id,applicant.getApplicantID());
    }
}