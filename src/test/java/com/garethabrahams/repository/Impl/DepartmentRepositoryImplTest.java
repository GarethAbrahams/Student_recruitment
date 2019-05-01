package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.Staff.DepartmentFactory;
import com.garethabrahams.model.Staff.Department;
import com.garethabrahams.repository.DepartmentRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class DepartmentRepositoryImplTest {
    private static DepartmentRepository departmentRepository;
    private static Department dept;
    private static Set<Department> Departments = new HashSet<>();

    @Test
    public void create() {
        departmentRepository = DepartmentRepositoryImpl.getRepository();

        dept = DepartmentFactory.createDepartment("Techops");

        Departments.add(departmentRepository.create(dept));
        Assert.assertEquals("Techops",departmentRepository.read(dept.getDepartment()).getDepartment());
    }

    @Test
    public void update() {
        create();
        Department techops = departmentRepository.update(dept);
        Assert.assertEquals(techops.getDepartment(),dept.getDepartment());
    }

    @Test
    public void delete() {
        create();
        Department techops = departmentRepository.read(dept.getDepartment());
        departmentRepository.delete(techops.getDepartment());
        Assert.assertEquals(techops,departmentRepository.read(dept.getDepartment()));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals("Techops",departmentRepository.read(dept.getDepartment()).getDepartment());
    }
}