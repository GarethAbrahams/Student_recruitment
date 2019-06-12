package com.garethabrahams.service.Impl.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.service.Applicant.ApplicantCityService;
import com.garethabrahams.service.Applicant.Impl.ApplicantCityServiceImpl;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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