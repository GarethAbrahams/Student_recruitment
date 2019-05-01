package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.repository.ApplicantCityRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ApplicationCityRepositoryImplTest {
    private static ApplicantCityRepository applicationCityRepository;
    private static ApplicantCity City;
    private static Set<ApplicantCity> citySet = new HashSet<>();

    @Test
    public void create() {
        applicationCityRepository = ApplicationCityRepositoryImpl.getRepository();

        City = ApplicantCityFactory.creatApplicantCity("Cape Town");
        citySet.add(applicationCityRepository.create(City));

        Assert.assertEquals("Cape Town",applicationCityRepository.read(City.getCity()).getCity());


    }

    @Test
    public void update() {
        create();
        ApplicantCity city = applicationCityRepository.update(City);
        Assert.assertEquals(city.getCity(),City.getCity());
    }

    @Test
    public void delete() {
        create();
        ApplicantCity city = applicationCityRepository.read(City.getCity());
        applicationCityRepository.delete(city.getCity());
        Assert.assertEquals(city,applicationCityRepository.read(City.getCity()));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals("Cape Town",applicationCityRepository.read(City.getCity()).getCity());

    }
}