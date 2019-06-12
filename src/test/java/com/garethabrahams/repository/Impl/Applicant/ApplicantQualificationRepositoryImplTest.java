package com.garethabrahams.repository.Impl.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Applicant.ApplicantQualificationFactory;
import com.garethabrahams.factory.General.CourseFactory;
import com.garethabrahams.factory.General.FacaltyFactory;
import com.garethabrahams.factory.General.InstitutionFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Applicant.ApplicantContact;
import com.garethabrahams.model.Applicant.ApplicantQualification;
import com.garethabrahams.model.General.Course;
import com.garethabrahams.model.General.Facalty;
import com.garethabrahams.model.General.Institution;
import com.garethabrahams.repository.Applicant.ApplicantQualificationRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicantQualificationRepositoryImpl;
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
public class ApplicantQualificationRepositoryImplTest {
    @Autowired
    private static ApplicantQualificationRepository repository;
    private static ApplicantQualification qualification;
    private String localQual;

    @Test
    public void create() throws IOException {
        repository = ApplicantQualificationRepositoryImpl.getRepository();

        Facalty Engineering = FacaltyFactory.createFacalty("Engineering");
        ApplicantCity cpt = ApplicantCityFactory.creatApplicantCity("Cape town");
        Institution CPUT = InstitutionFactory.createInstitution("CPUT",cpt);
        Course course = CourseFactory.createCourse("DIP Appdev", Engineering,CPUT);
        qualification = ApplicantQualificationFactory.createApplicantQualification("AppDev","2020",course);

        ApplicantQualification results = repository.create(qualification);
        localQual = results.getQualificationName();
        Assert.assertEquals(localQual,results.getQualificationName());

    }

    @Test
    public void update() throws IOException {
        create();

        ApplicantQualification result = repository.read(localQual);
        System.out.println("before update, name = "+result.getQualificationName());

        String newQualification = "Programming";
        ApplicantQualification updated = new ApplicantQualification.Builder().copy(result).QualificationName(newQualification).build();

        System.out.println("After update(update), name = "+updated.getQualificationName());
        this.repository.update(updated);
        Assert.assertSame(newQualification,updated.getQualificationName());
    }

    @Test
    public void delete() throws IOException {
        create();

        ApplicantQualification result = repository.read(localQual);
        repository.delete(localQual);
        Assert.assertEquals(localQual,result.getQualificationName());
    }

    @Test
    public void read() throws IOException {
        create();
        ApplicantQualification result = repository.read(localQual);
        Assert.assertEquals(result.getQualificationName(),localQual);

    }
}