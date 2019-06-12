package com.garethabrahams.repository.Impl.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.repository.Applicant.ApplicantCityRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicationCityRepositoryImpl;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
@SpringBootTest
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.JVM)
public class ApplicationCityRepositoryImplTest {
    @Autowired
    private static ApplicantCityRepository repository;
    private static ApplicantCity City;
    private String localCity;

    @Test
    public void create() throws IOException {
        repository = ApplicationCityRepositoryImpl.getRepository();

        City = ApplicantCityFactory.creatApplicantCity("Cape Town");
        ApplicantCity result = repository.create(City);
        localCity = result.getCity();
        Assert.assertEquals(localCity,result.getCity());

    }

    @Test
    public void update() throws IOException {
        create();
        ApplicantCity result = repository.read(localCity);
        System.out.println("before update, name = " + result.getCity());

        String newCity = "Durban";
        ApplicantCity updated = new ApplicantCity.Builder().copy(result).city(newCity).build();
        System.out.println("After update(update), name = "+updated.getCity());
        this.repository.update(updated);

        Assert.assertSame(newCity,updated.getCity());



    }

    @Test
    public void delete() throws IOException {
        create();
        ApplicantCity result = repository.read(localCity);
        repository.delete(localCity);
        Assert.assertEquals(result,repository.read(localCity));
    }

    @Test
    public void read() throws IOException {
        create();
        ApplicantCity result = repository.read(localCity);
        Assert.assertEquals(localCity,result.getCity());

    }
}