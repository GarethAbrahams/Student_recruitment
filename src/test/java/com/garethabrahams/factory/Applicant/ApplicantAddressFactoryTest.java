package com.garethabrahams.factory.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Applicant.ApplicatantAddressFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Applicant.ApplicantAddress;
import org.junit.Assert;
import org.junit.Test;


public class ApplicantAddressFactoryTest {

    @Test
    public void createApplicatantAddress() {
        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        ApplicantAddress address = ApplicatantAddressFactory.createApplicatantAddress("18 2nd Avenue","Fairways", city);
        Assert.assertEquals("18 2nd Avenue",address.getAddress());
        Assert.assertEquals("Cape Town",address.getCity());
    }
}