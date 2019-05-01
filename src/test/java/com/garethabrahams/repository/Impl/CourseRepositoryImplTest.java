package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Institution.CourseFactory;
import com.garethabrahams.factory.Institution.FacaltyFactory;
import com.garethabrahams.factory.Institution.InstitutionFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.Institution.Course;
import com.garethabrahams.model.Institution.Facalty;
import com.garethabrahams.model.Institution.Institution;
import com.garethabrahams.repository.CourseRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CourseRepositoryImplTest {
    private static CourseRepository courseRepository;
    private static Course course;
    private static Set<Course> CourseSet = new HashSet<>();

    @Test
    public void create() {
        courseRepository = CourseRepositoryImpl.getRepository();

        Facalty engineering = FacaltyFactory.createFacalty("Engineering");
        ApplicantCity cpt = ApplicantCityFactory.creatApplicantCity("CPT");
        Institution cput = InstitutionFactory.createInstitution("CPUT",cpt);
        course = CourseFactory.createCourse("Plumber",engineering,cput);

        CourseSet.add(courseRepository.create(course));

        Assert.assertEquals("Plumber",courseRepository.read(course.getCourseName()).getCourseName());
    }

    @Test
    public void update() {
        create();
        Course plumber = courseRepository.update(course);
        Assert.assertEquals(plumber.getCourseName(),course.getCourseName());
    }

    @Test
    public void delete() {
        create();
        Course plumber = courseRepository.read(course.getCourseName());
        courseRepository.delete(plumber.getCourseName());
        Assert.assertEquals(plumber,courseRepository.read(course.getCourseName()));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals("Plumber",courseRepository.read(course.getCourseName()).getCourseName());
    }
}