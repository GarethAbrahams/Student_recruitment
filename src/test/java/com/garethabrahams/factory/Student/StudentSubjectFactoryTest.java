package com.garethabrahams.factory.Student;

import com.garethabrahams.factory.Student.StudentSubjectFactory;
import com.garethabrahams.model.Student.StudentSubjects;
import org.junit.Assert;
import org.junit.Test;

public class StudentSubjectFactoryTest {

    @Test
    public void subject() {
        StudentSubjects subject = StudentSubjectFactory.subject("Maths",90);
        Assert.assertNotNull(subject);
        Assert.assertEquals("Maths",subject.getSubjectName());
    }
}