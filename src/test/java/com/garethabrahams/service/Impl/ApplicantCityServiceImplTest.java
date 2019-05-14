package com.garethabrahams.service.Impl;

import com.garethabrahams.factory.ApplicantCityFactory;
import com.garethabrahams.model.ApplicantCity;
import com.garethabrahams.repository.ApplicantCityRepository;
import com.garethabrahams.service.ApplicantCityService;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantCityServiceImplTest {

    private static ApplicantCityService service;
    private static ApplicantCity City;
    private static Set<ApplicantCity> citySet = new HashSet<>();


    @Test
    public void getAll() {
        create();
        citySet = service.getAll();
        Assert.assertNotNull(citySet);
    }

    @Test
    public void create() {
        service = ApplicantCityServiceImpl.getApplicantCityService();

        City = ApplicantCityFactory.creatApplicantCity("Cape Town");
        citySet.add(service.create(City));

        Assert.assertEquals("Cape Town",service.read(City.getCity()).getCity());
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals("Cape Town",service.read(City.getCity()).getCity());
    }

    @Test
    public void update() {
        create();
        String newCity = "JHB";
        System.out.println("before update, name = "+City.getCity());
        ApplicantCity updated = new ApplicantCity.Builder().copy(City).city(newCity).build();
        System.out.println("After update(update), name = "+updated.getCity());
        this.service.update(updated);
        Assert.assertSame(newCity,updated.getCity());

    }

    @Test
    public void delete() {
        create();
        service.delete(City.getCity());
        service.getAll();

    }
}