package com.garethabrahams.factory;

import com.garethabrahams.model.StudentSchool;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentSchoolFactoryTest {

    @Test
    public void createSchool() {
        StudentSchool school = StudentSchoolFactory.createSchool("Athlone High","Athlone","Western Cape","2010");
        Assert.assertEquals("Athlone",school.getArea());
    }
}