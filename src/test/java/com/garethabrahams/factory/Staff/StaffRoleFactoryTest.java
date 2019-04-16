package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.StaffRole;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaffRoleFactoryTest {

    @Test
    public void creatStudentRole() {

        StaffRole role = StaffRoleFactory.creatStudentRole("Manager");
        Assert.assertEquals("Manager",role.getRoleType());
    }
}