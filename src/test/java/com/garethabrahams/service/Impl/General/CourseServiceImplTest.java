package com.garethabrahams.service.Impl.General;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.General.CourseFactory;
import com.garethabrahams.factory.General.FacaltyFactory;
import com.garethabrahams.factory.General.InstitutionFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.General.Course;
import com.garethabrahams.model.General.Facalty;
import com.garethabrahams.model.General.Institution;
import com.garethabrahams.service.General.CourseService;
import com.garethabrahams.service.General.Impl.CourseServiceImpl;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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