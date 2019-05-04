package com.garethabrahams.factory.Applicant;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.model.ApplicantCity;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantCityFactoryTest {

    @Test
    public void creatStudentCity() {
        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        Assert.assertEquals("Cape Town",city.getCity());
    }
}