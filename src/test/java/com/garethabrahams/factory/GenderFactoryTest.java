package com.garethabrahams.factory;

import com.garethabrahams.model.Gender;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GenderFactoryTest {

    @Test
    public void createGender() {

        Gender gender = GenderFactory.createGender("Male");
        String id = gender.getId();

        Assert.assertEquals(id,gender.getId());
    }
}