package com.garethabrahams.service.Impl.General;

import com.garethabrahams.factory.General.FacaltyFactory;
import com.garethabrahams.model.General.Facalty;
import com.garethabrahams.service.General.FacaltyService;
import com.garethabrahams.service.General.Impl.FacaltyServiceImpl;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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