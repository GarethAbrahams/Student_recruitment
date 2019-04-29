package com.garethabrahams.factory.Institution;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Institution.Course;
import com.garethabrahams.model.Institution.Facalty;
import com.garethabrahams.model.Institution.Institution;
import org.junit.Assert;
import org.junit.Test;

public class CourseFactoryTest {

    @Test
    public void createCourse() {
        Facalty engineering = FacaltyFactory.createFacalty("Engineering");
        ApplicantCity cpt = ApplicantCityFactory.creatApplicantCity("CPT");
        Institution cput = InstitutionFactory.createInstitution("CPUT",cpt);
        Course course = CourseFactory.createCourse("Plumber",engineering,cput);
        Assert.assertEquals("Plumber",course.getCourseName());
    }
}