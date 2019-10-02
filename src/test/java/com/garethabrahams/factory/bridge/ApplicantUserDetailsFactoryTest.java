package com.garethabrahams.factory.bridge;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.UserDetailsFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.bridge.ApplicantUserDetails;
import com.garethabrahams.model.UserDetails;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantUserDetailsFactoryTest {

    @Test
    public void createApplicantUserDetails() {
        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams", "1234567890");
        String appID = applicant.getApplicantID();
        UserDetails user = UserDetailsFactory.createUserDetails("gareth","password");

        ApplicantUserDetails result = ApplicantUserDetailsFactory.createApplicantUserDetails(appID,user.getUsername());
        Assert.assertEquals(appID,result.getApplicantID());

    }
}