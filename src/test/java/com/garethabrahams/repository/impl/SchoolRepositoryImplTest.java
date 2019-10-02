package com.garethabrahams.repository.impl;

import com.garethabrahams.factory.SchoolFactory;
import com.garethabrahams.model.School;
import com.garethabrahams.repository.SchoolRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class SchoolRepositoryImplTest {

    private static SchoolRepository repository;
    private static School school;
    private String id;

    @Before
    @Test
    public void create() {
        repository = SchoolRepositoryImpl.getRepository();

        school = SchoolFactory.createSchool("Athlone High","Cape Town","2000");
        id = school.getSchoolID();
        School result = repository.create(school);
        Assert.assertEquals(id,result.getSchoolID());
    }

    @Test
    public void getAll() {
        Set<School> result = repository.getAll();
        Assert.assertNotNull(result);
    }

    @Test
    public void update() {
        School result = repository.read(id);
        String sinton = "Sinton High";
        School newSchool = new School.Builder().copy(result).schoolName(sinton).build();
        School newRead = repository.update(newSchool);

        Assert.assertEquals(id,newRead.getSchoolID());
        Assert.assertEquals(sinton,newRead.getSchoolname());
    }

    @Test
    public void delete() {
        School result = repository.read(id);
        repository.delete(id);
        School newResult = repository.read(id);
        Assert.assertNull(newResult);
    }

    @Test
    public void read() {
        School result = repository.read(id);
        Assert.assertEquals(id,result.getSchoolID());
    }
}