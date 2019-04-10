package com.garethabrahams.factory;

import com.garethabrahams.model.Student;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentFactoryTest {

    @Test
    public void creatStudent() {
        Student s = StudentFactory.creatStudent("Gareth", "Abrahams", "1234657980", "garetha6@gmail", "0846549870000","Cape Town", "CPUT",12000.00);
        Assert.assertEquals("Gareth", s.getName());
    }
}