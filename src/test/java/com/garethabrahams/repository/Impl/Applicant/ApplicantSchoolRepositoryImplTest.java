package com.garethabrahams.repository.Impl.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Applicant.ApplicantSchoolFactory;
import com.garethabrahams.model.Applicant.Applicant;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Applicant.ApplicantSchool;
import com.garethabrahams.repository.Applicant.ApplicantSchoolRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicantSchoolRepositoryImpl;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class ApplicantSchoolRepositoryImplTest {
    @Autowired
    private static ApplicantSchoolRepository repository;
    private static ApplicantSchool school;
    private String localSchool;

    @Test
    public void create() throws IOException {
        repository = ApplicantSchoolRepositoryImpl.getRepository();

        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        school = ApplicantSchoolFactory.createSchool("Athlone High","Athlone","Western Cape","2010",city);

        ApplicantSchool result = repository.create(school);
        localSchool = result.getSchoolname();

        Assert.assertEquals(localSchool,result.getSchoolname());
    }

    @Test
    public void update() throws IOException {
        create();
        ApplicantSchool school = repository.read(localSchool);
        System.out.println("before update, name = "+school.getSchoolname());

        String newSchoolName = "Sinton High";

        ApplicantSchool updated = new ApplicantSchool.Builder().copy(school).schoolName(newSchoolName).build();
        System.out.println("After update(update), name = "+updated.getSchoolname());
        this.repository.update(updated);
        Assert.assertSame(newSchoolName,updated.getSchoolname());

    }

    @Test
    public void delete() throws IOException {
        create();
        ApplicantSchool result = repository.read(localSchool);
        repository.delete(localSchool);
        Assert.assertEquals(localSchool,result.getSchoolname());

    }

    @Test
    public void read() throws IOException {
        create();
        ApplicantSchool result = repository.read(localSchool);
        Assert.assertEquals(localSchool,result.getSchoolname());
    }
}