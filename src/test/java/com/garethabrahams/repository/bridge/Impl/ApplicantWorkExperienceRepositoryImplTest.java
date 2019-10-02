package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.WorkExperienceFactory;
import com.garethabrahams.factory.bridge.ApplicantWorkExperienceFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.WorkExperience;
import com.garethabrahams.model.bridge.ApplicantWorkExperience;
import com.garethabrahams.repository.bridge.ApplicantWorkExperienceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantWorkExperienceRepositoryImplTest {

    private static ApplicantWorkExperienceRepository repository;
    private static ApplicantWorkExperience appWork;
    private String applicantID;

    @Before
    @Test
    public void create() {
        repository = ApplicantWorkExperienceRepositoryImpl.getRepository();

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams","1234567890");
        WorkExperience work = WorkExperienceFactory.createWorkExperience("CPUT","Cape Town","2000","ICT technician",10);
        appWork = ApplicantWorkExperienceFactory.createApplicantWorkExperience(applicant.getApplicantID(),work.getWorkID());
        applicantID = applicant.getApplicantID();
        ApplicantWorkExperience result = repository.create(appWork);
        Assert.assertEquals(applicantID,result.getApplicantID());
    }

    @Test
    public void read() {
        ApplicantWorkExperience result = repository.read(applicantID);
        Assert.assertEquals(applicantID,result.getApplicantID());

    }

    @Test
    public void update() {
        ApplicantWorkExperience result = repository.read(applicantID);
        WorkExperience newResult = WorkExperienceFactory.createWorkExperience("Engen","Cape Town","2000","ICT technician",10);
        String newID = newResult.getWorkID();
        ApplicantWorkExperience update = new ApplicantWorkExperience.Builder().copy(result).workID(newID).build();
        ApplicantWorkExperience newRead = repository.update(update);

        Assert.assertEquals(applicantID,newRead.getApplicantID());
        Assert.assertEquals(newID,newRead.getWorkID());

    }

    @Test
    public void delete() {
        ApplicantWorkExperience result = repository.read(applicantID);
        repository.delete(applicantID);
        ApplicantWorkExperience newResult = repository.read(applicantID);
        Assert.assertNull(newResult);
    }

    @Test
    public void getAll() {
        Set<ApplicantWorkExperience> result = repository.getAll();
        Assert.assertNotNull(result);
    }
}