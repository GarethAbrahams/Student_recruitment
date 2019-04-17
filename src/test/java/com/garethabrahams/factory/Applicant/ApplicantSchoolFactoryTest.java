package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.ApplicantSchool;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantSchoolFactoryTest {

    @Test
    public void createSchool() {
        ApplicantSchool school = ApplicantSchoolFactory.createSchool("Athlone High","Athlone","Western Cape","2010");
        Assert.assertEquals("Athlone",school.getArea());
    }
}