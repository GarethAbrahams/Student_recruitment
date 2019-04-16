package com.garethabrahams.factory.Student;

import com.garethabrahams.model.Student.StudentCity;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentCityFactoryTest {

    @Test
    public void creatStudentCity() {
        StudentCity city = StudentCityFactory.creatStudentCity("Cape Town");
        Assert.assertEquals("Cape Town",city.getCity());
    }
}