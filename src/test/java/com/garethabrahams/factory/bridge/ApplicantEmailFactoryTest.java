package com.garethabrahams.factory.bridge;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.EmailFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.bridge.ApplicantEmail;
import com.garethabrahams.model.Email;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantEmailFactoryTest {

    @Test
    public void createApplicantEmail() {

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams", "1234567890");
        String appID = applicant.getApplicantID();

        Email email = EmailFactory.createEmail("gareth@gmail.com");
        String emailID = email.getEmailID();

        ApplicantEmail appEmail = ApplicantEmailFactory.createApplicantEmail(appID,emailID);

        Assert.assertEquals(appID,appEmail.getApplicantID());
    }
}