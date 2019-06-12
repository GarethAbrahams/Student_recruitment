package com.garethabrahams.factory.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Applicant.ApplicantWorkExperienceFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Applicant.ApplicantWorkExperience;
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