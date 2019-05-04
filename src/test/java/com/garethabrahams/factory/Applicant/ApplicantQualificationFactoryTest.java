package com.garethabrahams.factory.Applicant;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.factory.ApplicantQualificationFactory;
import com.garethabrahams.factory.CourseFactory;
import com.garethabrahams.factory.FacaltyFactory;
import com.garethabrahams.factory.InstitutionFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.ApplicantQualification;
import com.garethabrahams.model.Course;
import com.garethabrahams.model.Facalty;
import com.garethabrahams.model.Institution;
import org.junit.Assert;
import org.junit.Test;

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