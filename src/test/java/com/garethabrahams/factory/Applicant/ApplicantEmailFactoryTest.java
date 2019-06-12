package com.garethabrahams.factory.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantEmailFactory;
import com.garethabrahams.model.Applicant.ApplicantEmail;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantEmailFactoryTest {

    @Test
    public void createApplicantEmail() {
        ApplicantEmail email = ApplicantEmailFactory.createApplicantEmail("gareth@gmail.com");
        Assert.assertEquals("gareth@gmail.com",email.getEmail());
    }
}