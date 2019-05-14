package com.garethabrahams.factory;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.factory.ApplicantSchoolFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.ApplicantSchool;
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