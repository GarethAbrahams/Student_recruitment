package com.garethabrahams.service.Impl;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.factory.CourseFactory;
import com.garethabrahams.factory.FacaltyFactory;
import com.garethabrahams.factory.InstitutionFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.model.Course;
import com.garethabrahams.model.Facalty;
import com.garethabrahams.model.Institution;
import com.garethabrahams.service.CourseService;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class CourseServiceImplTest {
    private static CourseService service;
    private static Course course;
    private static Set<Course> courseSet = new HashSet<>();

    @Test
    public void getAll() {
        create();
        courseSet = service.getAll();
        Assert.assertNotNull(courseSet);
    }

    @Test
    public void create() {
        service = CourseServiceImpl.getCourseService();

        Facalty engineering = FacaltyFactory.createFacalty("Engineering");
        ApplicantCity cpt = ApplicantCityFactory.creatApplicantCity("CPT");
        Institution cput = InstitutionFactory.createInstitution("CPUT",cpt);
        course = CourseFactory.createCourse("AppDev",engineering,cput);

        courseSet.add(service.create(course));

        Assert.assertEquals("AppDev",service.read(course.getCourseName()).getCourseName());
    }

    @Test
    public void read() {
        Assert.assertEquals("AppDev",service.read(course.getCourseName()).getCourseName());
    }

    @Test
    public void update() {
        String newCourse = "DevOps";
        System.out.println("before update, name = "+course.getCourseName());
        Course updated = new Course.Builder().copy(course).courseName(newCourse).build();
        System.out.println("After update(update), name = "+updated.getCourseName());
        this.service.update(updated);
        Assert.assertSame(newCourse,updated.getCourseName());
    }

    @Test
    public void delete() {
        service.delete(course.getCourseName());
        Assert.assertNotNull(courseSet);
    }
}