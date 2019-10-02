package com.garethabrahams.repository.impl;

import com.garethabrahams.factory.RoleFactory;
import com.garethabrahams.model.Role;
import com.garethabrahams.repository.RoleRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RoleRepositoryImplTest {

    private static RoleRepository repository;
    private static Role role;
    private String id;

    @Before
    @Test
    public void create() {
        repository = RoleRepositoryImpl.getRepository();

        role = RoleFactory.createRole("SQL admin");
        id = role.getRoleID();
        Role result = repository.create(role);
        Assert.assertEquals(id,result.getRoleID());
    }

    @Test
    public void getAll() {
        Set<Role> result = repository.getAll();
        Assert.assertNotNull(result);
    }

    @Test
    public void update() {
        Role result = repository.read(id);
        String ict = "ICT";
        Role newRole = new Role.Builder().copy(result).role(ict).build();
        Role newRead = repository.update(newRole);

        Assert.assertEquals(id,newRead.getRoleID());
        Assert.assertEquals(ict,newRead.getRole());
    }

    @Test
    public void delete() {
        Role result = repository.read(id);
        repository.delete(id);
        Role newResult = repository.read(id);
        Assert.assertNull(newResult);
    }

    @Test
    public void read() {
        Role result = repository.read(id);
        Assert.assertEquals(id,result.getRoleID());
    }
}