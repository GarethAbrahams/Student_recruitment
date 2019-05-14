package com.garethabrahams.service.Impl;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.factory.ApplicantSchoolFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.ApplicantSchool;
import com.garethabrahams.service.ApplicantSchoolService;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantSchoolServiceImplTest {
    private static ApplicantSchoolService service;
    private static ApplicantSchool school;
    private static Set<ApplicantSchool> schoolSet = new HashSet<>();

    @Test
    public void getAll() {
        create();
        schoolSet = service.getAll();
        Assert.assertNotNull(schoolSet);
    }

    @Test
    public void create() {
        service = ApplicantSchoolServiceImpl.getApplicantSchoolService();

        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        school = ApplicantSchoolFactory.createSchool("Athlone High","Athlone","Western Cape","2010",city);

        schoolSet.add(service.create(school));
        Assert.assertEquals("Athlone High",service.read(school.getSchoolname()).getSchoolname());
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals("Athlone High",service.read(school.getSchoolname()).getSchoolname());
    }

    @Test
    public void update() {
        create();
        String newSchool = "Sinton";
        System.out.println("before update, name = "+school.getSchoolname());
        ApplicantSchool updated = new ApplicantSchool.Builder().copy(school).schoolName(newSchool).build();
        System.out.println("After update(update), name = "+updated.getSchoolname());
        this.service.update(updated);
        Assert.assertSame(newSchool,updated.getSchoolname());
    }

    @Test
    public void delete() {
        create();
        service.delete(school.getSchoolname());
        Assert.assertNotNull(schoolSet);
    }
}