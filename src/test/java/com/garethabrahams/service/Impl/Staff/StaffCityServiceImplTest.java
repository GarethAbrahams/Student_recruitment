package com.garethabrahams.service.Impl.Staff;

import com.garethabrahams.factory.Staff.StaffCityFactory;
import com.garethabrahams.model.Staff.StaffCity;
import com.garethabrahams.service.Staff.Impl.StaffCityServiceImpl;
import com.garethabrahams.service.Staff.StaffCityService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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