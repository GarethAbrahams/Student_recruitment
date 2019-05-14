package com.garethabrahams.factory;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.factory.ApplicatantAddressFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.ApplicantAddress;
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