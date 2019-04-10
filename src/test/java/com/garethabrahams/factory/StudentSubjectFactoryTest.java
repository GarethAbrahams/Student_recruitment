package com.garethabrahams.factory;

import com.garethabrahams.model.StudentSubjects;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentSubjectFactoryTest {

    @Test
    public void subject() {
        StudentSubjects subject = StudentSubjectFactory.subject("Maths",90);
        Assert.assertNotNull(subject);
        Assert.assertEquals("Maths",subject.getSubjectName());
    }
}