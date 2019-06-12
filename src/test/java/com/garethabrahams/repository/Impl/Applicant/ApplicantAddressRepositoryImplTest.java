package com.garethabrahams.repository.Impl.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Applicant.ApplicatantAddressFactory;
import com.garethabrahams.model.Applicant.ApplicantAddress;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.repository.Applicant.ApplicantAddressRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicantAddressRepositoryImpl;
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
public class ApplicantAddressRepositoryImplTest {
    @Autowired
    private static ApplicantAddressRepository repository;
    private static ApplicantAddress address;
    private String localAddress;

    @Test
    public void create() throws IOException {
        repository = ApplicantAddressRepositoryImpl.getRepository();

        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        address = ApplicatantAddressFactory.createApplicatantAddress("18 2nd Avenue","Fairways",city);
        ApplicantAddress result = repository.create(address);
        localAddress = result.getAddress();
        Assert.assertEquals(localAddress,address.getAddress());

    }

    @Test
    public void update() throws IOException{
        create();
        ApplicantAddress address = repository.read(localAddress);
        System.out.println("before update, name = "+address.getAddress());

        String newAddress = "4 Haywood Road";
        ApplicantAddress updated = new ApplicantAddress.Builder().copy(address).address(newAddress).build();
        System.out.println("After update(update), name = "+updated.getAddress());
        this.repository.update(updated);
        Assert.assertSame(newAddress,updated.getAddress());

    }

    @Test
    public void delete() throws IOException{
        create();
        ApplicantAddress add = repository.read(localAddress);
        repository.delete(localAddress);
        Assert.assertEquals(localAddress,repository.read("18 2nd Avenue").getAddress());
    }

    @Test
    public void read() throws IOException{
        create();

        ApplicantAddress result = repository.read(localAddress);
        Assert.assertEquals(result.getAddress(),localAddress);
    }
}