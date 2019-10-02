package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.QualificationFactory;
import com.garethabrahams.factory.bridge.ApplicantQualificationFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.Qualification;
import com.garethabrahams.model.bridge.ApplicantQualification;
import com.garethabrahams.repository.bridge.ApplicantQualificationRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantQualificationRepositoryImplTest {

    private static ApplicantQualificationRepository repository;
    private static ApplicantQualification appQual;
    private String applicantID;

    @Before
    @Test
    public void create() {
        repository = ApplicantQualificationRepositoryImpl.getRepository();

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams","1234567890");
        Qualification qual = QualificationFactory.createQualification("ICT","2015","CPUT");
        appQual = ApplicantQualificationFactory.createApplicantQualification(applicant.getApplicantID(),qual.getQualificationID());
        applicantID = applicant.getApplicantID();
        ApplicantQualification result = repository.create(appQual);
        Assert.assertEquals(applicantID,result.getApplicantID());
    }

    @Test
    public void read() {
        ApplicantQualification result = repository.read(applicantID);
        Assert.assertEquals(applicantID,result.getApplicantID());

    }

    @Test
    public void update() {
        ApplicantQualification result = repository.read(applicantID);
        Qualification newResult = QualificationFactory.createQualification("SQL Admin","2015","CPUT");
        String newID = newResult.getQualificationID();
        ApplicantQualification update = new ApplicantQualification.Builder().copy(result).qualificationID(newID).build();
        ApplicantQualification newRead = repository.update(update);

        Assert.assertEquals(applicantID,newRead.getApplicantID());
        Assert.assertEquals(newID,newRead.getQualificationID());

    }

    @Test
    public void delete() {
        ApplicantQualification result = repository.read(applicantID);
        repository.delete(applicantID);
        ApplicantQualification newResult = repository.read(applicantID);
        Assert.assertNull(newResult);
    }

    @Test
    public void getAll() {
        Set<ApplicantQualification> result = repository.getAll();
        Assert.assertNotNull(result);
    }
}