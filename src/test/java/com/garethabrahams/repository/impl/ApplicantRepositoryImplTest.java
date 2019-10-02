package com.garethabrahams.repository.impl;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.repository.ApplicantRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantRepositoryImplTest {

    private static ApplicantRepository repository;
    private static Applicant applicant;
    private String applicantID;

    @Before
    @Test
    public void create() {
        repository = ApplicantRepositoryImpl.getRepository();

        applicant = ApplicantFactory.createApplicant("Gareth","Abrahams","1234567890");
        applicantID = applicant.getApplicantID();
        Applicant result = repository.create(applicant);
        Assert.assertEquals(applicantID,result.getApplicantID());
    }

    @Test
    public void read() {
        Applicant result = repository.read(applicantID);
        Assert.assertEquals(applicantID,result.getApplicantID());

    }

    @Test
    public void update() {
        Applicant result = repository.read(applicantID);
        String last = "Schipper";
        Applicant update = new Applicant.Builder().copy(result).surname(last).build();
        Applicant newResult = repository.update(update);

        Assert.assertEquals(applicantID,newResult.getApplicantID());
        Assert.assertEquals(last,newResult.getSurname());

    }

    @Test
    public void delete() {
        Applicant result = repository.read(applicantID);
        repository.delete(applicantID);
        Applicant newResult = repository.read(applicantID);
        Assert.assertNull(newResult);
    }

    @Test
    public void getAll() {
        Set<Applicant> result = repository.getAll();
        Assert.assertNotNull(result);
    }
}