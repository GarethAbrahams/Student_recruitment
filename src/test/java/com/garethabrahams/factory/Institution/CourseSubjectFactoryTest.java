package com.garethabrahams.factory.Institution;

import com.garethabrahams.model.Institution.CourseSubjects;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CourseSubjectFactoryTest {

    @Test
    public void createCourseSubjects() {
        CourseSubjects  subject = CourseSubjectFactory.CreateCourseSubjects("ADP",50);
        Assert.assertEquals("ADP",subject.getCourseSubject());
    }
}