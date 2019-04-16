package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.Administrator;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdministratorFactoryTest {

    @Test
    public void createAdministrator() {
        Administrator admin = AdministratorFactory.createAdministrator("Gareth","Abrahams","123456");
        Assert.assertEquals("Gareth",admin.getName());
    }
}