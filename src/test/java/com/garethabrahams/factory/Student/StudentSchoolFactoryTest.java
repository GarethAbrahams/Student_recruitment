package com.garethabrahams.factory.Student;

import com.garethabrahams.factory.Student.StudentSchoolFactory;
import com.garethabrahams.model.Student.StudentSchool;
import org.junit.Assert;
import org.junit.Test;

public class StudentSchoolFactoryTest {

    @Test
    public void createSchool() {
        StudentSchool school = StudentSchoolFactory.createSchool("Athlone High","Athlone","Western Cape","2010");
        Assert.assertEquals("Athlone",school.getArea());
    }
}