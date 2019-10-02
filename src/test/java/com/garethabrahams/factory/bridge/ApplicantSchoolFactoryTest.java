package com.garethabrahams.factory.bridge;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.SchoolFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.bridge.ApplicantSchool;
import com.garethabrahams.model.School;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantSchoolFactoryTest {

    @Test
    public void createApplicantSchool() {
        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams", "1234567890");
        String appID = applicant.getApplicantID();
        School school = SchoolFactory.createSchool("Athlone High","Cape Town","2000");
        String schoolID = school.getSchoolID();

        ApplicantSchool result = ApplicantSchoolFactory.createApplicantSchool(appID,schoolID);

        Assert.assertEquals(appID,result.getApplicantID());

    }
}