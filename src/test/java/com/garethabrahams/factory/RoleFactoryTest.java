package com.garethabrahams.factory;

import com.garethabrahams.model.Role;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RoleFactoryTest {

    @Test
    public void createRole() {
        Role role = RoleFactory.createRole("ICT technician");
        String id = role.getRoleID();

        Assert.assertEquals(id,role.getRoleID());
    }
}