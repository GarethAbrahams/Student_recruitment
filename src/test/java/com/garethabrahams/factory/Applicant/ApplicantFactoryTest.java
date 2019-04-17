package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.Applicant;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantFactoryTest {

    @Test
    public void creatStudent() {
        Applicant applicant = ApplicantFactory.createApplicant("Gareth", "Abrahams", "1234657980");
        Assert.assertEquals("Gareth", applicant.getName());
    }
}