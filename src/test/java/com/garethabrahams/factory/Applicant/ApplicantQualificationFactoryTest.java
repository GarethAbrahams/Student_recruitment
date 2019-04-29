package com.garethabrahams.factory.Applicant;

import com.garethabrahams.factory.Institution.CourseFactory;
import com.garethabrahams.factory.Institution.FacaltyFactory;
import com.garethabrahams.factory.Institution.InstitutionFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Applicant.ApplicantQualification;
import com.garethabrahams.model.Institution.Course;
import com.garethabrahams.model.Institution.Facalty;
import com.garethabrahams.model.Institution.Institution;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.border.EmptyBorder;

import static org.junit.Assert.*;

public class ApplicantQualificationFactoryTest {

    @Test
    public void createApplicantQualification() {
        Facalty Engineering = FacaltyFactory.createFacalty("Engineering");
        ApplicantCity cpt = ApplicantCityFactory.creatApplicantCity("Cape town");
        Institution CPUT = InstitutionFactory.createInstitution("CPUT",cpt);
        Course course = CourseFactory.createCourse("DIP Appdev", Engineering,CPUT);
        ApplicantQualification qualification = ApplicantQualificationFactory.createApplicantQualification("AppDev","2020",course);
        Assert.assertEquals("AppDev",qualification.getQualificationName());
    }
}