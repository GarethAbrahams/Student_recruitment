package com.garethabrahams.repository.Impl.General;

import com.garethabrahams.factory.General.RolesFactory;
import com.garethabrahams.model.General.Roles;
import com.garethabrahams.repository.General.Impl.RolesRepositoryImpl;
import com.garethabrahams.repository.General.RolesRepository;
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
public class RolesRepositoryImplTest {
    @Autowired
    private static RolesRepository repository;
    private static Roles role;
    private String localRole;

    @Test
    public void create() throws IOException {
        repository = RolesRepositoryImpl.getRepository();

        role = RolesFactory.createRoles("technician");
        Roles result = repository.create(role);
        localRole = result.getRole();
        Assert.assertEquals(localRole,result.getRole());
    }

    @Test
    public void update() throws IOException {
        create();
        Roles result = repository.read(localRole);
        System.out.println("before update, name = " + result.getRole());
        String newRole = "Manager";
        Roles updated = new Roles.Builder().copy(result).role(newRole).build();
        System.out.println("After update(update), name = "+updated.getRole());
        this.repository.update(updated);

        Assert.assertSame(newRole,updated.getRole());
    }

    @Test
    public void delete() throws IOException {
        create();
        Roles result = repository.read(localRole);
        repository.delete(localRole);
        Assert.assertEquals(result,repository.read(localRole));
    }

    @Test
    public void read() throws IOException {
        create();
        Roles result = repository.read(localRole);
        Assert.assertEquals(localRole,result.getRole());
    }
}