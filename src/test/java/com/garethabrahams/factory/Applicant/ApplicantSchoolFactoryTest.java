package com.garethabrahams.factory.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Applicant.ApplicantSchoolFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Applicant.ApplicantSchool;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantSchoolFactoryTest {

    @Test
    public void createSchool() {
        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        ApplicantSchool school = ApplicantSchoolFactory.createSchool("Athlone High","Athlone","Western Cape","2010",city);
        Assert.assertEquals("Athlone",school.getArea());
    }
}