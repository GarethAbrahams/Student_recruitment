package com.garethabrahams.factory.Institution;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.factory.CourseFactory;
import com.garethabrahams.factory.FacaltyFactory;
import com.garethabrahams.factory.InstitutionFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.Course;
import com.garethabrahams.model.Facalty;
import com.garethabrahams.model.Institution;
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