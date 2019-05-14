package com.garethabrahams.factory;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.factory.ApplicantWorkExperienceFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.ApplicantWorkExperience;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantWorkExperienceFactoryTest {

    @Test
    public void createWorkExperience() {
        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        ApplicantWorkExperience workExperience = ApplicantWorkExperienceFactory.createWorkExperience("CPUT","CPT","5 years","developer",city);
        Assert.assertEquals("CPUT",workExperience.getCompany());
    }
}