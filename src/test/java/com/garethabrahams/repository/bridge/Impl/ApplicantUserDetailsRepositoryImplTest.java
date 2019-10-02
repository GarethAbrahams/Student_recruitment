package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.UserDetailsFactory;
import com.garethabrahams.factory.bridge.ApplicantUserDetailsFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.UserDetails;
import com.garethabrahams.model.bridge.ApplicantUserDetails;
import com.garethabrahams.repository.bridge.ApplicantUserDetailsRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantUserDetailsRepositoryImplTest {

    private static ApplicantUserDetailsRepository repository;
    private static ApplicantUserDetails appUser;
    private String applicantID;

    @Before
    @Test
    public void create() {
        repository = ApplicantUserDetailsRepositoryImpl.getRepository();

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams","1234567890");
        UserDetails user = UserDetailsFactory.createUserDetails("gareth","password");
        appUser = ApplicantUserDetailsFactory.createApplicantUserDetails(applicant.getApplicantID(),user.getUsername());
        applicantID = applicant.getApplicantID();
        ApplicantUserDetails result = repository.create(appUser);
        Assert.assertEquals(applicantID,result.getApplicantID());
    }

    @Test
    public void read() {
        ApplicantUserDetails result = repository.read(applicantID);
        Assert.assertEquals(applicantID,result.getApplicantID());

    }

    @Test
    public void update() {
        ApplicantUserDetails result = repository.read(applicantID);
        UserDetails newResult = UserDetailsFactory.createUserDetails("gareth","password0");
        String newID = newResult.getUsername();
        ApplicantUserDetails update = new ApplicantUserDetails.Builder().copy(result).username(newID).build();
        ApplicantUserDetails newRead = repository.update(update);

        Assert.assertEquals(applicantID,newRead.getApplicantID());
        Assert.assertEquals(newID,newRead.getUsername());

    }

    @Test
    public void delete() {
        ApplicantUserDetails result = repository.read(applicantID);
        repository.delete(applicantID);
        ApplicantUserDetails newResult = repository.read(applicantID);
        Assert.assertNull(newResult);
    }

    @Test
    public void getAll() {
        Set<ApplicantUserDetails> result = repository.getAll();
        Assert.assertNotNull(result);
    }
}