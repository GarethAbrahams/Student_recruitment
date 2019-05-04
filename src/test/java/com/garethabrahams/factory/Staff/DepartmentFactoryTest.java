package com.garethabrahams.factory.Staff;

import com.garethabrahams.factory.DepartmentFactory;
import com.garethabrahams.model.Department;
import org.junit.Assert;
import org.junit.Test;

public class DepartmentFactoryTest {

    @Test
    public void createDepartment() {
        Department dept = DepartmentFactory.createDepartment("Techops");
        Assert.assertEquals("Techops",dept.getDepartment());
    }
}