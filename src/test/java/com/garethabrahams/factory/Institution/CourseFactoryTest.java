package com.garethabrahams.factory.Institution;

import com.garethabrahams.model.Institution.Course;
import com.garethabrahams.model.Institution.CourseSubjects;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseFactoryTest {

    @Test
    public void createCourse() {
        Course course = CourseFactory.createCourse("Plumber","4 year",20000);
        Assert.assertEquals("Plumber",course.getCourseName());
    }
}