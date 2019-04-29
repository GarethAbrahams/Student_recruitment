package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.Roles;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RolesFactoryTest {

    @Test
    public void createRoles() {
        Roles role = RolesFactory.createRoles("technician");
        Assert.assertEquals("technician",role.getRole());
    }
}