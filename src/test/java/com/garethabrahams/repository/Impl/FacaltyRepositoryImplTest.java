package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.Institution.FacaltyFactory;
import com.garethabrahams.model.Institution.Facalty;
import com.garethabrahams.repository.FacaltyRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class FacaltyRepositoryImplTest {
    private static FacaltyRepository facaltyRepository;
    private static Facalty facalty;
    private static Set<Facalty> facaltySet = new HashSet<>();

    @Test
    public void create() {
        facaltyRepository = FacaltyRepositoryImpl.getRepository();

        facalty = FacaltyFactory.createFacalty("ICT");

        facaltySet.add(facaltyRepository.create(facalty));

        Assert.assertEquals("ICT",facaltyRepository.read(facalty.getFacaltyName()).getFacaltyName());
    }

    @Test
    public void update() {
        create();
        Facalty dept = facaltyRepository.update(facalty);
        Assert.assertEquals(dept.getFacaltyName(),facalty.getFacaltyName());
    }

    @Test
    public void delete() {
        create();
        Facalty dept = facaltyRepository.read(facalty.getFacaltyName());
        facaltyRepository.delete(dept.getFacaltyName());
        Assert.assertEquals(dept,facaltyRepository.read(facalty.getFacaltyName()));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals("ICT",facaltyRepository.read(facalty.getFacaltyName()).getFacaltyName());
    }
}