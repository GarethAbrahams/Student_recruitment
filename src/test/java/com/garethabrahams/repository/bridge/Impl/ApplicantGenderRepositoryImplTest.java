package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.GenderFactory;
import com.garethabrahams.factory.bridge.ApplicantGenderFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.Gender;
import com.garethabrahams.model.bridge.ApplicantGender;
import com.garethabrahams.repository.bridge.ApplicantGenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantGenderRepositoryImplTest {

    private static ApplicantGenderRepository repository;
    private static ApplicantGender appGender;
    private String applicantID;

    @Before
    @Test
    public void create() {
        repository = ApplicantGenderRepositoryImpl.getRepository();

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams","1234567890");
        Gender gender = GenderFactory.createGender("Male");
        appGender = ApplicantGenderFactory.createApplicantGender(applicant.getApplicantID(),gender.getId());
        applicantID = applicant.getApplicantID();
        ApplicantGender result = repository.create(appGender);
        Assert.assertEquals(applicantID,result.getApplicantID());
    }

    @Test
    public void read() {
        ApplicantGender result = repository.read(applicantID);
        Assert.assertEquals(applicantID,result.getApplicantID());

    }

    @Test
    public void update() {
        ApplicantGender result = repository.read(applicantID);
        Gender newGender = GenderFactory.createGender("Female");
        String newID = newGender.getId();
        ApplicantGender update = new ApplicantGender.Builder().copy(result).genderID(newID).build();
        ApplicantGender newResult = repository.update(update);

        Assert.assertEquals(applicantID,newResult.getApplicantID());
        Assert.assertEquals(newID,newResult.getGenderID());

    }

    @Test
    public void delete() {
        ApplicantGender result = repository.read(applicantID);
        repository.delete(applicantID);
        ApplicantGender newResult = repository.read(applicantID);
        Assert.assertNull(newResult);
    }

    @Test
    public void getAll() {
        Set<ApplicantGender> result = repository.getAll();
        Assert.assertNotNull(result);
    }
}