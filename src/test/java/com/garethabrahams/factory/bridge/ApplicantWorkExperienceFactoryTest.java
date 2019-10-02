package com.garethabrahams.factory.bridge;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.WorkExperienceFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.bridge.ApplicantWorkExperience;
import com.garethabrahams.model.WorkExperience;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantWorkExperienceFactoryTest {


    @Test
    public void createApplicantWorkExperience() {
        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams", "1234567890");
        String appID = applicant.getApplicantID();
        WorkExperience work = WorkExperienceFactory.createWorkExperience("CPUT","Cape Town","2000","ICT technician",10);
        String workID = work.getWorkID();

        ApplicantWorkExperience result = ApplicantWorkExperienceFactory.createApplicantWorkExperience(appID,workID);

        Assert.assertEquals(appID,result.getApplicantID());
    }
}