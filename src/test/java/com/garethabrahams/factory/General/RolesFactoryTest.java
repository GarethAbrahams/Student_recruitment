package com.garethabrahams.factory.General;

import com.garethabrahams.factory.General.RolesFactory;
import com.garethabrahams.model.General.Roles;
import org.junit.Assert;
import org.junit.Test;

public class RolesFactoryTest {

    @Test
    public void createRoles() {
        Roles role = RolesFactory.createRoles("technician");
        Assert.assertEquals("technician",role.getRole());
    }
}