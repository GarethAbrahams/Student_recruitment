package com.garethabrahams.factory.Student;

import com.garethabrahams.model.Student.StudentCourse;
import org.junit.Assert;
import org.junit.Test;

public class StudentCourseFactoryTest {

    @Test
    public void course() {
        StudentCourse course = StudentCourseFactory.course("Programming","CPUT","3 years",70000);
        Assert.assertEquals("Programming",course.getCourseName());
    }
}