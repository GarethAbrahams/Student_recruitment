package com.garethabrahams.repository.Impl.General;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.General.CourseFactory;
import com.garethabrahams.factory.General.FacaltyFactory;
import com.garethabrahams.factory.General.InstitutionFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.model.General.Course;
import com.garethabrahams.model.General.Facalty;
import com.garethabrahams.model.General.Institution;
import com.garethabrahams.repository.General.CourseRepository;
import com.garethabrahams.repository.General.Impl.CourseRepositoryImpl;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class CourseRepositoryImplTest {
    @Autowired
    private static CourseRepository repository;
    private static Course course;
    private String localCourse;

    @Test
    public void create() throws IOException {
        repository = CourseRepositoryImpl.getRepository();

        Facalty engineering = FacaltyFactory.createFacalty("Engineering");
        ApplicantCity cpt = ApplicantCityFactory.creatApplicantCity("CPT");
        Institution cput = InstitutionFactory.createInstitution("CPUT",cpt);
        course = CourseFactory.createCourse("Plumber",engineering,cput);

        Course result = repository.create(course);
        localCourse = result.getCourseName();
        Assert.assertEquals(localCourse,result.getCourseName());

    }

    @Test
    public void update() throws IOException {
        create();
        Course plumber = repository.read(localCourse);
        System.out.println("before update, name = " + plumber.getCourseName());
        String newCourseName = "Electrician";
        Course updated = new Course.Builder().copy(plumber).courseName(newCourseName).build();
        System.out.println("After update(update), name = "+updated.getCourseName());
        this.repository.update(updated);

        Assert.assertSame(newCourseName,updated.getCourseName());

    }

    @Test
    public void delete() throws IOException {
        create();
        Course plumber = repository.read(localCourse);
        repository.delete(localCourse);
        Assert.assertEquals(plumber,repository.read(localCourse));

    }

    @Test
    public void read() throws IOException {
        create();
        Course result = repository.read(localCourse);
        Assert.assertEquals(localCourse,result.getCourseName());
    }
}