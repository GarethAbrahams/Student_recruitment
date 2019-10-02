package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.RoleFactory;
import com.garethabrahams.factory.bridge.ApplicantRoleFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.Role;
import com.garethabrahams.model.bridge.ApplicantRole;
import com.garethabrahams.repository.bridge.ApplicantRoleRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantRoleRepositoryImplTest {

    private static ApplicantRoleRepository repository;
    private static ApplicantRole appRole;
    private String applicantID;

    @Before
    @Test
    public void create() {
        repository = ApplicantRoleRepositoryImpl.getRepository();

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams","1234567890");
        Role role = RoleFactory.createRole("ICT");
        appRole = ApplicantRoleFactory.createApplicantRole(applicant.getApplicantID(),role.getRoleID());
        applicantID = applicant.getApplicantID();
        ApplicantRole result = repository.create(appRole);
        Assert.assertEquals(applicantID,result.getApplicantID());
    }

    @Test
    public void read() {
        ApplicantRole result = repository.read(applicantID);
        Assert.assertEquals(applicantID,result.getApplicantID());

    }

    @Test
    public void update() {
        ApplicantRole result = repository.read(applicantID);
        Role newResult = RoleFactory.createRole("SQL admin");
        String newID = newResult.getRoleID();
        ApplicantRole update = new ApplicantRole.Builder().copy(result).roleID(newID).build();
        ApplicantRole newRead = repository.update(update);

        Assert.assertEquals(applicantID,newRead.getApplicantID());
        Assert.assertEquals(newID,newRead.getRoleID());

    }

    @Test
    public void delete() {
        ApplicantRole result = repository.read(applicantID);
        repository.delete(applicantID);
        ApplicantRole newResult = repository.read(applicantID);
        Assert.assertNull(newResult);
    }

    @Test
    public void getAll() {
        Set<ApplicantRole> result = repository.getAll();
        Assert.assertNotNull(result);
    }
}