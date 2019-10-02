package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.SchoolFactory;
import com.garethabrahams.factory.bridge.ApplicantSchoolFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.School;
import com.garethabrahams.model.bridge.ApplicantSchool;
import com.garethabrahams.repository.bridge.ApplicantSchoolRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantSchoolRepositoryImplTest {

    private static ApplicantSchoolRepository repository;
    private static ApplicantSchool appSchool;
    private String applicantID;

    @Before
    @Test
    public void create() {
        repository = ApplicantSchoolRepositoryImpl.getRepository();

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams","1234567890");
        School school = SchoolFactory.createSchool("Athlone High","Cape Town","2000");
        appSchool = ApplicantSchoolFactory.createApplicantSchool(applicant.getApplicantID(),school.getSchoolID());
        applicantID = applicant.getApplicantID();
        ApplicantSchool result = repository.create(appSchool);
        Assert.assertEquals(applicantID,result.getApplicantID());
    }

    @Test
    public void read() {
        ApplicantSchool result = repository.read(applicantID);
        Assert.assertEquals(applicantID,result.getApplicantID());

    }

    @Test
    public void update() {
        ApplicantSchool result = repository.read(applicantID);
        School newResult = SchoolFactory.createSchool("Athlone High","Cape Town","2000");
        String newID = newResult.getSchoolID();
        ApplicantSchool update = new ApplicantSchool.Builder().copy(result).schoolID(newID).build();
        ApplicantSchool newRead = repository.update(update);

        Assert.assertEquals(applicantID,newRead.getApplicantID());
        Assert.assertEquals(newID,newRead.getSchoolID());

    }

    @Test
    public void delete() {
        ApplicantSchool result = repository.read(applicantID);
        repository.delete(applicantID);
        ApplicantSchool newResult = repository.read(applicantID);
        Assert.assertNull(newResult);
    }

    @Test
    public void getAll() {
        Set<ApplicantSchool> result = repository.getAll();
        Assert.assertNotNull(result);
    }
}