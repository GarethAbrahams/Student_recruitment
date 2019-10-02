package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.ContactFactory;
import com.garethabrahams.factory.bridge.ApplicantContactFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.Contact;
import com.garethabrahams.model.bridge.ApplicantContact;
import com.garethabrahams.repository.bridge.ApplicantContactRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantContactRepositoryImplTest {

    private static ApplicantContactRepository repository;
    private static ApplicantContact appContact;
    private String applicantID;

    @Before
    @Test
    public void create() {
        repository = ApplicantContactRepositoryImpl.getRepository();

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams","1234567890");
        Contact contact = ContactFactory.createContact("0211234567","0824567892");
        appContact = ApplicantContactFactory.createApplicantContact(applicant.getApplicantID(),contact.getContactID());
        applicantID = applicant.getApplicantID();
        ApplicantContact result = repository.create(appContact);
        Assert.assertEquals(applicantID,result.getApplicantID());
    }

    @Test
    public void read() {
        ApplicantContact result = repository.read(applicantID);
        Assert.assertEquals(applicantID,result.getApplicantID());

    }

    @Test
    public void update() {
        ApplicantContact result = repository.read(applicantID);
        Contact newCell = ContactFactory.createContact("02155887744", "08255889966");
        String newConID = newCell.getContactID();
        ApplicantContact update = new ApplicantContact.Builder().copy(result).contactID(newConID).build();
        ApplicantContact newResult = repository.update(update);

        Assert.assertEquals(applicantID,newResult.getApplicantID());
        Assert.assertEquals(newConID,newResult.getContactID());

    }

    @Test
    public void delete() {
        ApplicantContact result = repository.read(applicantID);
        repository.delete(applicantID);
        ApplicantContact newResult = repository.read(applicantID);
        Assert.assertNull(newResult);
    }

    @Test
    public void getAll() {
        Set<ApplicantContact> result = repository.getAll();
        Assert.assertNotNull(result);
    }
}