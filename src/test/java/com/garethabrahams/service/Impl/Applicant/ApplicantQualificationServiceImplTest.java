package com.garethabrahams.service.Impl.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Applicant.ApplicantQualificationFactory;
import com.garethabrahams.factory.General.CourseFactory;
import com.garethabrahams.factory.General.FacaltyFactory;
import com.garethabrahams.factory.General.InstitutionFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Applicant.ApplicantQualification;
import com.garethabrahams.model.General.Course;
import com.garethabrahams.model.General.Facalty;
import com.garethabrahams.model.General.Institution;
import com.garethabrahams.service.Applicant.ApplicantQualificationService;
import com.garethabrahams.service.Applicant.Impl.ApplicantQualificationServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApplicantQualificationServiceImplTest {

    private static ApplicantQualificationService service;
    private static ApplicantQualification qualification;
    private static Set<ApplicantQualification> qualificationSet = new HashSet<>();

    @Before
    public void createQualification(){
        service = ApplicantQualificationServiceImpl.getApplicantQualificationService();

        Facalty Engineering = FacaltyFactory.createFacalty("Engineering");
        ApplicantCity cpt = ApplicantCityFactory.creatApplicantCity("Cape town");
        Institution CPUT = InstitutionFactory.createInstitution("CPUT",cpt);
        Course course = CourseFactory.createCourse("DIP Appdev", Engineering,CPUT);
        qualification = ApplicantQualificationFactory.createApplicantQualification("AppDev","2020",course);
    }



    @Test
    public void getAll() {
        qualificationSet = service.getAll();
        Assert.assertNotNull(qualificationSet);
    }

    @Test
    public void create() {

        qualificationSet.add(service.create(qualification));

        Assert.assertEquals(qualification.getCourse().getCourseName(),service.read(qualification.getQualificationName()).getCourse().getCourseName());
    }

    @Test
    public void read() {
        Assert.assertEquals("DIP Appdev",service.read(qualification.getQualificationName()).getCourse().getCourseName());
    }

    @Test
    public void update() {
        String newQualificationName = "DevOps";
        System.out.println("before update, name = "+qualification.getQualificationName());
        ApplicantQualification updated = new ApplicantQualification.Builder().copy(qualification).QualificationName(newQualificationName).build();
        System.out.println("After update(update), name = "+updated.getQualificationName());
        this.service.update(updated);
        Assert.assertSame(newQualificationName,updated.getQualificationName());
    }

    @Test
    public void delete() {
        service.delete(qualification.getQualificationName());
        qualificationSet = service.getAll();
        Assert.assertNotNull(qualificationSet);
    }
}