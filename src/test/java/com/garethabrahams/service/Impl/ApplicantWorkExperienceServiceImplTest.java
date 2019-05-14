package com.garethabrahams.service.Impl;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.factory.ApplicantWorkExperienceFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.ApplicantWorkExperience;
import com.garethabrahams.service.ApplicantWorkExperienceService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantWorkExperienceServiceImplTest {

    private static ApplicantWorkExperienceService service;
    private static ApplicantWorkExperience workExperience;
    private static Set<ApplicantWorkExperience> workExperienceSet = new HashSet<>();

    @Test
    public void getAll() {
        workExperienceSet = service.getAll();
        Assert.assertNotNull(workExperienceSet);
    }

    @Test
    public void create() {
        service = ApplicantWorkExperienceServiceImpl.getApplicantWorkExperienceService();
        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        workExperience = ApplicantWorkExperienceFactory.createWorkExperience("Korbitec","Newlands","2 years","developer",city);
        workExperienceSet.add(service.create(workExperience));
        Assert.assertEquals("Korbitec",service.read(workExperience.getCompany()).getCompany());
    }

    @Test
    public void read() {
        System.out.println(service.read(workExperience.getCompany()).getCompany());
        Assert.assertEquals("Korbitec",service.read(workExperience.getCompany()).getCompany());

    }

    @Test
    public void update() {
        String newWorkExperience = "LexisNexis";
        System.out.println("before update, name = "+workExperience.getCompany());
        ApplicantWorkExperience updated = new ApplicantWorkExperience.Builder().copy(workExperience).company(newWorkExperience).build();
        System.out.println("After update(update), name = "+updated.getCompany());
        this.service.update(updated);
        Assert.assertSame(newWorkExperience,updated.getCompany());
    }

    @Test
    public void delete() {
        service.delete(workExperience.getCompany());
        workExperienceSet = service.getAll();
        Assert.assertNotNull(workExperienceSet);
    }
}