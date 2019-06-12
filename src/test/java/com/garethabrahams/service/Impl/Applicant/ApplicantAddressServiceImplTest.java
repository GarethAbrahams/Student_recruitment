package com.garethabrahams.service.Impl.Applicant;

import ch.qos.logback.core.encoder.EchoEncoder;
import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Applicant.ApplicatantAddressFactory;
import com.garethabrahams.model.Applicant.ApplicantAddress;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.service.Applicant.ApplicantAddressService;
import com.garethabrahams.service.Applicant.Impl.ApplicantAddressServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApplicantAddressServiceImplTest {
    private static ApplicantAddressService service;
    private static ApplicantAddress address;
    private static Set<ApplicantAddress> addressSet = new HashSet<>();


    @Test
    public void getAll() {
        create();
        addressSet = service.getAll();
        Assert.assertNotNull(addressSet);
    }

    @Test
    public void create() {
        service = ApplicantAddressServiceImpl.getApplicantAddressService();

        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        address = ApplicatantAddressFactory.createApplicatantAddress("18 2nd Avenue","Fairways",city);
        this.service.create(address);

        Assert.assertEquals("18 2nd Avenue",service.read(address.getAddress()).getAddress());
    }

    @Test
    public void read() {
        Assert.assertEquals("18 2nd Avenue",service.read(address.getAddress()).getAddress());
    }

    @Test
    public void update() {
        String newAddress = "4 Haywood Road";
        System.out.println("before update, name = "+address.getAddress());
        ApplicantAddress updated = new ApplicantAddress.Builder().copy(address).address(newAddress).build();
        System.out.println("After update(update), name = "+updated.getAddress());
        this.service.update(updated);
        Assert.assertSame(newAddress,updated.getAddress());
    }

    @Test
    public void delete() {
        service.delete(address.getAddress());
        Assert.assertNotNull(addressSet);
    }
}