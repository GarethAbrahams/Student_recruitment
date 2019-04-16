package com.garethabrahams.factory.Student;

import com.garethabrahams.factory.Student.StudentFactory;
import com.garethabrahams.model.Student.Student;
import org.junit.Assert;
import org.junit.Test;

public class StudentFactoryTest {

    @Test
    public void creatStudent() {
        Student s = StudentFactory.creatStudent("Gareth", "Abrahams", "1234657980", "garetha6@gmail", "0846549870000","Cape Town", 12000.00);
        Assert.assertEquals("Gareth", s.getName());
    }
}