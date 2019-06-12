package com.garethabrahams.repository.Impl.General;

import com.garethabrahams.factory.General.DepartmentFactory;
import com.garethabrahams.model.General.Department;
import com.garethabrahams.repository.General.DepartmentRepository;
import com.garethabrahams.repository.General.Impl.DepartmentRepositoryImpl;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class DepartmentRepositoryImplTest {
    @Autowired
    private static DepartmentRepository repository;
    private static Department dept;
    private String deptName;

    @Test
    public void create() throws IOException {
        repository = DepartmentRepositoryImpl.getRepository();

        dept = DepartmentFactory.createDepartment("Techops");
        Department result = repository.create(dept);
        deptName = result.getDepartment();
        Assert.assertEquals(deptName,result.getDepartment());
    }

    @Test
    public void update() throws IOException {
        create();
        Department result = repository.read(deptName);
        System.out.println("before update, name = " + result.getDepartment());
        String newDeptName = "Finance";
        Department updated = new Department.Builder().copy(result).department(newDeptName).build();
        System.out.println("After update(update), name = "+updated.getDepartment());
        this.repository.update(updated);

        Assert.assertSame(newDeptName,updated.getDepartment());
    }

    @Test
    public void delete() throws IOException {
        create();
        Department techops = repository.read(deptName);
        repository.delete(deptName);
        Assert.assertEquals(techops,repository.read(deptName));
    }

    @Test
    public void read() throws IOException {
        create();
        Department result = repository.read(deptName);
        Assert.assertEquals(deptName,result.getDepartment());
    }
}