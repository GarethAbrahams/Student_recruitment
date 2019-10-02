package com.garethabrahams.repository.impl;

import com.garethabrahams.factory.RaceFactory;
import com.garethabrahams.model.Race;
import com.garethabrahams.repository.RaceRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class RaceRepositoryImplTest {

    private static RaceRepository repository;
    private static Race race;
    private String id;

    @Before
    @Test
    public void create() {
        repository = RaceRepositoryImpl.getRepository();

        race = RaceFactory.createRace("Coloured");
        id = race.getId();
        Race result = repository.create(race);
        Assert.assertEquals(id,result.getId());
    }

    @Test
    public void getAll() {
        Set<Race> result = repository.getAll();
        Assert.assertNotNull(result);
    }

    @Test
    public void update() {
        Race result = repository.read(id);
        String white = "white";
        Race newRace = new Race.Builder().copy(result).raceDesc(white).build();
        Race newRead = repository.update(newRace);

        Assert.assertEquals(id,newRead.getId());
        Assert.assertEquals(white,newRead.getRace());
    }

    @Test
    public void delete() {
        Race result = repository.read(id);
        repository.delete(id);
        Race newResult = repository.read(id);
        Assert.assertNull(newResult);
    }

    @Test
    public void read() {
        Race result = repository.read(id);
        Assert.assertEquals(id,result.getId());
    }
}