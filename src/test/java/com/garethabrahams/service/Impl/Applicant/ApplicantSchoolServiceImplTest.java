package com.garethabrahams.service.Impl.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Applicant.ApplicantSchoolFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Applicant.ApplicantSchool;
import com.garethabrahams.service.Applicant.ApplicantSchoolService;
import com.garethabrahams.service.Applicant.Impl.ApplicantSchoolServiceImpl;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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