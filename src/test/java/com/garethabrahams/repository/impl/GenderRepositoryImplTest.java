package com.garethabrahams.repository.impl;

import com.garethabrahams.factory.GenderFactory;
import com.garethabrahams.model.Gender;
import com.garethabrahams.repository.GenderRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class GenderRepositoryImplTest {

    private static GenderRepository repository;
    private static Gender gender;
    private String id;

    @Before
    @Test
    public void create() {
        repository = GenderRepositoryImpl.getRepository();

        gender = GenderFactory.createGender("Male");
        id = gender.getId();
        Gender result = repository.create(gender);
        Assert.assertEquals(id,result.getId());
    }

    @Test
    public void getAll() {
        Set<Gender> result = repository.getAll();
        Assert.assertNotNull(result);
    }

    @Test
    public void update() {
        Gender result = repository.read(id);
        String newGen = "Female";
        Gender newGender = new Gender.Builder().copy(result).Gender(newGen).build();
        Gender newRead = repository.update(newGender);

        Assert.assertEquals(id,newRead.getId());
        Assert.assertEquals(newGen,newRead.getGender());
    }

    @Test
    public void delete() {
        Gender result = repository.read(id);
        repository.delete(id);
        Gender newResult = repository.read(id);
        Assert.assertNull(newResult);
    }

    @Test
    public void read() {
        Gender result = repository.read(id);
        Assert.assertEquals(id,result.getId());
    }
}