package com.garethabrahams.factory.bridge;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.GenderFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.bridge.ApplicantGender;
import com.garethabrahams.model.Gender;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantGenderFactoryTest {

    @Test
    public void createApplicantGender() {

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams", "1234567890");
        String appID = applicant.getApplicantID();
        Gender gender = GenderFactory.createGender("Male");
        String genID = gender.getId();

        ApplicantGender appGen = ApplicantGenderFactory.createApplicantGender(appID,genID);

        Assert.assertEquals(appID,appGen.getApplicantID());
    }
}