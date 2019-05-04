package com.garethabrahams.factory.Applicant;

import com.garethabrahams.factory.*;
import com.garethabrahams.model.*;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantFactoryTest {

    @Test
    public void creatStudent() {
        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        ApplicantAddress address = ApplicatantAddressFactory.createApplicatantAddress("18 2nd Avenue","Fairways",city);
        ApplicantContact contact = ApplicantContactFactory.createApplicantContact("0212563254","0821234568");
        ApplicantEmail email = ApplicantEmailFactory.createApplicantEmail("gareth@gmail.com");
        Applicant applicant = ApplicantFactory.createApplicant("Gareth", "Abrahams", "1234657980", address, contact, email);
        Assert.assertEquals("0821234568", applicant.getContactCell());
    }
}