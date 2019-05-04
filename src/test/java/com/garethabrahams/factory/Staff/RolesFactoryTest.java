package com.garethabrahams.factory.Staff;

import com.garethabrahams.factory.RolesFactory;
import com.garethabrahams.model.Roles;
import org.junit.Assert;
import org.junit.Test;

public class RolesFactoryTest {

    @Test
    public void createRoles() {
        Roles role = RolesFactory.createRoles("technician");
        Assert.assertEquals("technician",role.getRole());
    }
}