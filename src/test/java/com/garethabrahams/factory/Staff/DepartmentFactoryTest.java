package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.Department;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentFactoryTest {

    @Test
    public void createDepartment() {
        Department department = DepartmentFactory.createDepartment("Techops");
        Assert.assertEquals("Techops",department.getDepartment());
    }
}