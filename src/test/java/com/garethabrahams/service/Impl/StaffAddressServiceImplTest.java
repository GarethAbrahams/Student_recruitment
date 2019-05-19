package com.garethabrahams.service.Impl;

import com.garethabrahams.factory.StaffAddressFactory;
import com.garethabrahams.factory.StaffCityFactory;
import com.garethabrahams.model.StaffAddress;
import com.garethabrahams.model.StaffCity;
import com.garethabrahams.service.StaffAddressService;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class StaffAddressServiceImplTest {
    private static StaffAddressService service;
    private static StaffAddress address;
    private static Set<StaffAddress> addressSet = new HashSet<>();

    @Test
    public void getAll() {
        create();
        addressSet = service.getAll();
        Assert.assertNotNull(addressSet);
    }

    @Test
    public void create() {
        service = StaffAddressServiceImpl.getStaffAddressService();

        StaffCity city = StaffCityFactory.createStaffCity("Cape town");
        address = StaffAddressFactory.createStaffAddress("18 2nd Ave","Fairways",city);

        addressSet.add(service.create(address));

        Assert.assertEquals("18 2nd Ave",service.read(address.getAddress()).getAddress());
    }

    @Test
    public void read() {
        Assert.assertEquals("18 2nd Ave",service.read(address.getAddress()).getAddress());
    }

    @Test
    public void update() {
        String newAddress = "11 Plumbago Close";
        System.out.println("before update, name = "+address.getAddress());
        StaffAddress updated = new StaffAddress.Builder().copy(address).address(newAddress).build();
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