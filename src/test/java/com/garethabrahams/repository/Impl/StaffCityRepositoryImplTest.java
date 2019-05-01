package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.Staff.StaffCityFactory;
import com.garethabrahams.model.Staff.StaffCity;
import com.garethabrahams.repository.StaffCityRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class StaffCityRepositoryImplTest {

    private static StaffCityRepository staffCityRepository;
    private static StaffCity city;
    private static Set<StaffCity> CitySet = new HashSet<>();

    @Test
    public void create() {
        staffCityRepository = StaffCityRepositoryImpl.getRepository();

        city = StaffCityFactory.createStaffCity("Cape town");

        CitySet.add(staffCityRepository.create(city));

        Assert.assertEquals("Cape town",staffCityRepository.read(city.getCity()).getCity());
    }

    @Test
    public void update() {
        create();
        StaffCity newCity = staffCityRepository.update(city);
        Assert.assertEquals(newCity.getCity(),city.getCity());
    }

    @Test
    public void delete() {
        create();
        StaffCity newCity = staffCityRepository.read(city.getCity());
        staffCityRepository.delete(newCity.getCity());
        Assert.assertEquals(newCity,staffCityRepository.read(city.getCity()));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals("Cape town",staffCityRepository.read(city.getCity()).getCity());
    }
}