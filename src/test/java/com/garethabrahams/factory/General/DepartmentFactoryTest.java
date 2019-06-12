package com.garethabrahams.factory.General;

import com.garethabrahams.factory.General.DepartmentFactory;
import com.garethabrahams.model.General.Department;
import org.junit.Assert;
import org.junit.Test;

public class DepartmentFactoryTest {

    @Test
    public void createDepartment() {
        Department dept = DepartmentFactory.createDepartment("Techops");
        Assert.assertEquals("Techops",dept.getDepartment());
    }
}