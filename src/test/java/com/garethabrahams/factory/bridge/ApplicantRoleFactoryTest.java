package com.garethabrahams.factory.bridge;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.RoleFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.bridge.ApplicantRole;
import com.garethabrahams.model.Role;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantRoleFactoryTest {

    @Test
    public void createApplicantRole() {

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams", "1234567890");
        String appID = applicant.getApplicantID();
        Role role = RoleFactory.createRole("ICT technician");
        String roleID = role.getRoleID();

        ApplicantRole result = ApplicantRoleFactory.createApplicantRole(appID,roleID);

        Assert.assertEquals(appID,result.getApplicantID());
    }
}