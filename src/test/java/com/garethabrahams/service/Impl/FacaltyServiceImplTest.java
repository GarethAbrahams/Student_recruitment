package com.garethabrahams.service.Impl;

import com.garethabrahams.factory.FacaltyFactory;
import com.garethabrahams.model.Facalty;
import com.garethabrahams.service.FacaltyService;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class FacaltyServiceImplTest {

    private static FacaltyService service;
    private static Facalty facalty;
    private static Set<Facalty> facaltySet = new HashSet<>();

    @Test
    public void getAll() {
        create();
        facaltySet = service.getAll();
        Assert.assertNotNull(facaltySet);
    }

    @Test
    public void create() {
        service = FacaltyServiceImpl.getFacaltyService();

        facalty = FacaltyFactory.createFacalty("ICT");

        facaltySet.add(service.create(facalty));

        Assert.assertEquals("ICT",service.read(facalty.getFacaltyName()).getFacaltyName());
    }

    @Test
    public void read() {
        Assert.assertEquals("ICT",service.read(facalty.getFacaltyName()).getFacaltyName());

    }

    @Test
    public void update() {
        String newFacalty = "DevOps";
        System.out.println("before update, name = "+facalty.getFacaltyName());
        Facalty updated = new Facalty.Builder().copy(facalty).facaltyName(newFacalty).build();
        System.out.println("After update(update), name = "+updated.getFacaltyName());
        this.service.update(updated);
        Assert.assertSame(newFacalty,updated.getFacaltyName());
    }

    @Test
    public void delete() {
        service.delete(facalty.getFacaltyName());
        Assert.assertNotNull(facaltySet);
    }
}