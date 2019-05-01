package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Applicant.ApplicantSchoolFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Applicant.ApplicantSchool;
import com.garethabrahams.repository.ApplicantSchoolRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantSchoolRepositoryImplTest {
    private static ApplicantSchoolRepository applicantSchoolRepository;
    private static ApplicantSchool school;
    private static Set<ApplicantSchool> SchoolSet = new HashSet<>();

    @Test
    public void create() {
        applicantSchoolRepository = ApplicantSchoolRepositoryImpl.getRepository();

        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        school = ApplicantSchoolFactory.createSchool("Athlone High","Athlone","Western Cape","2010",city);

        SchoolSet.add(applicantSchoolRepository.create(school));
        Assert.assertEquals("Athlone High",applicantSchoolRepository.read(school.getSchoolname()).getSchoolname());
    }

    @Test
    public void update() {
        create();
        ApplicantSchool sch = applicantSchoolRepository.update(school);
        Assert.assertEquals(sch.getSchoolname(),school.getSchoolname());
    }

    @Test
    public void delete() {
        create();
        ApplicantSchool sch = applicantSchoolRepository.read(school.getSchoolname());
        applicantSchoolRepository.delete(school.getSchoolname());
        Assert.assertEquals(sch,applicantSchoolRepository.read(school.getSchoolname()));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals("Athlone High",applicantSchoolRepository.read(school.getSchoolname()).getSchoolname());
    }
}