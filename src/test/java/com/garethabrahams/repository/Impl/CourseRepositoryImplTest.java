package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.factory.CourseFactory;
import com.garethabrahams.factory.FacaltyFactory;
import com.garethabrahams.factory.InstitutionFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.Course;
import com.garethabrahams.model.Facalty;
import com.garethabrahams.model.Institution;
import com.garethabrahams.repository.CourseRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

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