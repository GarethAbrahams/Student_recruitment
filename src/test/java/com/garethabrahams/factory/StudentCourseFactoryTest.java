package com.garethabrahams.factory;

import com.garethabrahams.model.StudentCourse;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentCourseFactoryTest {

    @Test
    public void course() {
        StudentCourse course = StudentCourseFactory.course("Programming","CPUT","3 years",70000);
        Assert.assertEquals("Programming",course.getCourseName());
    }
}