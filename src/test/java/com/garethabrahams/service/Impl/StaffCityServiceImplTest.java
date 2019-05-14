package com.garethabrahams.service.Impl;

import com.garethabrahams.factory.StaffCityFactory;
import com.garethabrahams.model.StaffCity;
import com.garethabrahams.service.StaffCityService;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class StaffCityServiceImplTest {
    private static StaffCityService service;
    private static StaffCity city;
    private static Set<StaffCity> citySet = new HashSet<>();

    @Test
    public void getAll() {
        create();
        citySet = service.getAll();
        Assert.assertNotNull(citySet);
    }

    @Test
    public void create() {
        service = StaffCityServiceImpl.getStaffCityService();

        city = StaffCityFactory.createStaffCity("Cape town");

        citySet.add(service.create(city));

        Assert.assertEquals("Cape town",service.read(city.getCity()).getCity());
    }

    @Test
    public void read() {
        Assert.assertEquals("Cape town",service.read(city.getCity()).getCity());
    }

    @Test
    public void update() {
        String newCity = "JHB";
        System.out.println("before update, name = "+city.getCity());
        StaffCity updated = new StaffCity.Builder().copy(city).city(newCity).build();
        System.out.println("After update(update), name = "+updated.getCity());
        this.service.update(updated);
        Assert.assertSame(newCity,updated.getCity());
    }

    @Test
    public void delete() {
        service.delete(city.getCity());
        Assert.assertNotNull(citySet);
    }
}