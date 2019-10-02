package com.garethabrahams.repository.impl;

import com.garethabrahams.factory.WorkExperienceFactory;
import com.garethabrahams.model.WorkExperience;
import com.garethabrahams.repository.WorkExperienceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class WorkExperienceRepositoryImplTest {

    private static WorkExperienceRepository repository;
    private static WorkExperience work;
    private String id;

    @Before
    @Test
    public void create() {
        repository = WorkExperienceRepositoryImpl.getRepository();

        work = WorkExperienceFactory.createWorkExperience("CPUT","Cape Town","2000","ICT technician",10);

        id = work.getWorkID();
        WorkExperience result = repository.create(work);
        Assert.assertEquals(id,result.getWorkID());
    }

    @Test
    public void getAll() {
        Set<WorkExperience> result = repository.getAll();
        Assert.assertNotNull(result);
    }

    @Test
    public void update() {
        WorkExperience result = repository.read(id);
        String engen = "Engen";
        WorkExperience newWork = new WorkExperience.Builder().copy(result).company(engen).build();
        WorkExperience newRead = repository.update(newWork);

        Assert.assertEquals(id,newRead.getWorkID());
        Assert.assertEquals(engen,newRead.getCompany());
    }

    @Test
    public void delete() {
        WorkExperience result = repository.read(id);
        repository.delete(id);
        WorkExperience newResult = repository.read(id);
        Assert.assertNull(newResult);
    }

    @Test
    public void read() {
        WorkExperience result = repository.read(id);
        Assert.assertEquals(id,result.getWorkID());
    }
}