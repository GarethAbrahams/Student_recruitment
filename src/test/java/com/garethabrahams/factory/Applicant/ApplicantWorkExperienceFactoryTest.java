package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.ApplicantWorkExperience;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicantWorkExperienceFactoryTest {

    @Test
    public void createWorkExperience() {
        ApplicantWorkExperience workExperience = ApplicantWorkExperienceFactory.createWorkExperience("CPUT","CPT","5 years","developer");
        Assert.assertEquals("CPUT",workExperience.getCompany());
    }
}