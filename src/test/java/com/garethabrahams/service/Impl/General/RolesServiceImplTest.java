package com.garethabrahams.service.Impl.General;

import com.garethabrahams.factory.General.RolesFactory;
import com.garethabrahams.model.General.Roles;
import com.garethabrahams.service.General.Impl.RolesServiceImpl;
import com.garethabrahams.service.General.RolesService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RolesServiceImplTest {
    private static RolesService service;
    private static Roles role;
    private static Set<Roles> rolesSet = new HashSet<>();

    @Test
    public void getAll() {
        create();
        rolesSet = service.getAll();
        Assert.assertNotNull(rolesSet);
    }

    @Test
    public void create() {
        service = RolesServiceImpl.getRolesService();

        role = RolesFactory.createRoles("technician");

        rolesSet.add(service.create(role));

        Assert.assertEquals("technician",service.read(role.getRole()).getRole());
    }

    @Test
    public void read() {
        Assert.assertEquals("technician",service.read(role.getRole()).getRole());
    }

    @Test
    public void update() {
        String newRole = "DevOps";
        System.out.println("before update, name = "+role.getRole());
        Roles updated = new Roles.Builder().copy(role).role(newRole).build();
        System.out.println("After update(update), name = "+updated.getRole());
        this.service.update(updated);
        Assert.assertSame(newRole,updated.getRole());
    }

    @Test
    public void delete() {
        service.delete(role.getRole());
        Assert.assertNotNull(rolesSet);
    }
}