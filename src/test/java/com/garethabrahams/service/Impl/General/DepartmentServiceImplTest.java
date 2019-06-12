package com.garethabrahams.service.Impl.General;

import com.garethabrahams.factory.General.DepartmentFactory;
import com.garethabrahams.model.General.Department;
import com.garethabrahams.service.General.DepartmentService;
import com.garethabrahams.service.General.Impl.DepartmentServiceImpl;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentServiceImplTest {

    private static DepartmentService service;
    private static Department dept;
    private static Set<Department> deptSet = new HashSet<>();

    @Test
    public void getAll() {
        create();
        deptSet = service.getAll();
        Assert.assertNotNull(deptSet);
    }

    @Test
    public void create() {
        service = DepartmentServiceImpl.getDepartmentService();

        dept = DepartmentFactory.createDepartment("Techops");

        deptSet.add(service.create(dept));
        Assert.assertEquals("Techops",service.read(dept.getDepartment()).getDepartment());
    }

    @Test
    public void read() {
        Assert.assertEquals("Techops",service.read(dept.getDepartment()).getDepartment());

    }

    @Test
    public void update() {
        String newDept = "DevOps";
        System.out.println("before update, name = "+dept.getDepartment());
        Department updated = new Department.Builder().copy(dept).department(newDept).build();
        System.out.println("After update(update), name = "+updated.getDepartment());
        this.service.update(updated);
        Assert.assertSame(newDept,updated.getDepartment());
    }

    @Test
    public void delete() {
        service.delete(dept.getDepartment());
        Assert.assertNotNull(deptSet);
    }
}