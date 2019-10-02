package com.garethabrahams.repository.impl;

import com.garethabrahams.factory.UserDetailsFactory;
import com.garethabrahams.model.UserDetails;
import com.garethabrahams.repository.UserDetailsRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class UserDetailsRepositoryImplTest {

    private static UserDetailsRepository repository;
    private static UserDetails user;
    private String id;

    @Before
    @Test
    public void create() {
        repository = UserDetailsRepositoryImpl.getRepository();

        user = UserDetailsFactory.createUserDetails("gareth","password");
        id = user.getUsername();
        UserDetails result = repository.create(user);
        Assert.assertEquals(id,result.getUsername());
    }

    @Test
    public void getAll() {
        Set<UserDetails> result = repository.getAll();
        Assert.assertNotNull(result);
    }

    @Test
    public void update() {
        UserDetails result = repository.read(id);
        String password = "password0";
        UserDetails newRace = new UserDetails.Builder().copy(result).password(password).build();
        UserDetails newRead = repository.update(newRace);

        Assert.assertEquals(id,newRead.getUsername());
        Assert.assertEquals(password,newRead.getPassword());
    }

    @Test
    public void delete() {
        UserDetails result = repository.read(id);
        repository.delete(id);
        UserDetails newResult = repository.read(id);
        Assert.assertNotNull(newResult);
    }

    @Test
    public void read() {
        UserDetails result = repository.read(id);
        Assert.assertEquals(id,result.getUsername());
    }
}