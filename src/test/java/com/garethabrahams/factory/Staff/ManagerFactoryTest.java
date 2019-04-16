package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.Manager;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerFactoryTest {

    @Test
    public void createManager() {
        Manager manager = ManagerFactory.createManager("Gareth","Abrahams","123456","techops");
        Assert.assertEquals("Gareth",manager.getName());
    }
}