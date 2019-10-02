package com.garethabrahams.repository.impl;

import com.garethabrahams.factory.OutcomeFactory;
import com.garethabrahams.model.Outcome;
import com.garethabrahams.repository.OutcomeRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class OutcomeRepositoryImplTest {

    private static OutcomeRepository repository;
    private static Outcome outcome;
    private String id;

    @Before
    @Test
    public void create() {
        repository = OutcomeRepositoryImpl.getRepository();

        outcome = OutcomeFactory.createOutcome("Failed");
        id = outcome.getId();
        Outcome result = repository.create(outcome);
        Assert.assertEquals(id,result.getId());
    }

    @Test
    public void getAll() {
        Set<Outcome> result = repository.getAll();
        Assert.assertNotNull(result);
    }

    @Test
    public void update() {
        Outcome result = repository.read(id);
        String passed = "Passed";
        Outcome newResult = new Outcome.Builder().copy(result).result(passed).build();
        Outcome newRead = repository.update(newResult);

        Assert.assertEquals(id,newRead.getId());
        Assert.assertEquals(passed,newRead.getResult());
    }

    @Test
    public void delete() {
        Outcome result = repository.read(id);
        repository.delete(id);
        Outcome newResult = repository.read(id);
        Assert.assertNull(newResult);
    }

    @Test
    public void read() {
        Outcome result = repository.read(id);
        Assert.assertEquals(id,result.getId());
    }
}