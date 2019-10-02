package com.garethabrahams.factory;

import com.garethabrahams.model.School;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SchoolFactoryTest {

    @Test
    public void createSchool() {
        School school = SchoolFactory.createSchool("Athlone High","Cape Town","2000");
        String id = school.getSchoolID();

        Assert.assertEquals(id,school.getSchoolID());
    }
}