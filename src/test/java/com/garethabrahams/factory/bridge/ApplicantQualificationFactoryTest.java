package com.garethabrahams.factory.bridge;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.QualificationFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.bridge.ApplicantQualification;
import com.garethabrahams.model.Qualification;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantQualificationFactoryTest {

    @Test
    public void createApplicantQualification() {

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams", "1234567890");
        String appID = applicant.getApplicantID();
        Qualification qual = QualificationFactory.createQualification("ICT","2015","CPUT");
        String qualID = qual.getQualificationID();

        ApplicantQualification appQual = ApplicantQualificationFactory.createApplicantQualification(appID,qualID);

        Assert.assertEquals(appID,appQual.getApplicantID());
    }
}