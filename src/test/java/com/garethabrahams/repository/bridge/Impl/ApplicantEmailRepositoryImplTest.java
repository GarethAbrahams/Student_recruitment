package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.EmailFactory;
import com.garethabrahams.factory.bridge.ApplicantEmailFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.Email;
import com.garethabrahams.model.bridge.ApplicantEmail;
import com.garethabrahams.repository.bridge.ApplicantEmailRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantEmailRepositoryImplTest {

    private static ApplicantEmailRepository repository;
    private static ApplicantEmail appEmail;
    private String applicantID;

    @Before
    @Test
    public void create() {
        repository = ApplicantEmailRepositoryImpl.getRepository();

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams","1234567890");
        Email email = EmailFactory.createEmail("gareth@gmail.com");
        appEmail = ApplicantEmailFactory.createApplicantEmail(applicant.getApplicantID(),email.getEmailID());
        applicantID = applicant.getApplicantID();
        ApplicantEmail result = repository.create(appEmail);
        Assert.assertEquals(applicantID,result.getApplicantID());
    }

    @Test
    public void read() {
        ApplicantEmail result = repository.read(applicantID);
        Assert.assertEquals(applicantID,result.getApplicantID());

    }

    @Test
    public void update() {
        ApplicantEmail result = repository.read(applicantID);
        Email newEmail = EmailFactory.createEmail("ga@gmail.com");
        String newEmailID = newEmail.getEmailID();
        ApplicantEmail update = new ApplicantEmail.Builder().copy(result).emailID(newEmailID).build();
        ApplicantEmail newResult = repository.update(update);

        Assert.assertEquals(applicantID,newResult.getApplicantID());
        Assert.assertEquals(newEmailID,newResult.getEmailID());

    }

    @Test
    public void delete() {
        ApplicantEmail result = repository.read(applicantID);
        repository.delete(applicantID);
        ApplicantEmail newResult = repository.read(applicantID);
        Assert.assertNull(newResult);
    }

    @Test
    public void getAll() {
        Set<ApplicantEmail> result = repository.getAll();
        Assert.assertNotNull(result);
    }
}