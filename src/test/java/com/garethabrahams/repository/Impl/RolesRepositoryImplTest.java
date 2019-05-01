package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.Staff.RolesFactory;
import com.garethabrahams.model.Staff.Roles;
import com.garethabrahams.repository.RolesRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class RolesRepositoryImplTest {
    private static RolesRepository rolesRepository;
    private static Roles role;
    private static Set<Roles> rolesSet = new HashSet<>();

    @Test
    public void create() {
        rolesRepository = RolesRepositoryImpl.getRepository();

        role = RolesFactory.createRoles("technician");

        rolesSet.add(rolesRepository.create(role));

        Assert.assertEquals("technician",rolesRepository.read(role.getRole()).getRole());
    }

    @Test
    public void update() {
        create();
        Roles gareth = rolesRepository.update(role);
        Assert.assertEquals(gareth.getRole(),role.getRole());
    }

    @Test
    public void delete() {
        create();
        Roles gareth = rolesRepository.read(role.getRole());
        rolesRepository.delete(role.getRole());
        Assert.assertEquals(gareth,rolesRepository.read(role.getRole()));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals("technician",rolesRepository.read(role.getRole()).getRole());
    }
}