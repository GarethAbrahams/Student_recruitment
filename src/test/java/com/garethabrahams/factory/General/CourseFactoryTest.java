package com.garethabrahams.factory.General;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.General.CourseFactory;
import com.garethabrahams.factory.General.FacaltyFactory;
import com.garethabrahams.factory.General.InstitutionFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.General.Course;
import com.garethabrahams.model.General.Facalty;
import com.garethabrahams.model.General.Institution;
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