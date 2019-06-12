package com.garethabrahams.factory.Applicant;

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