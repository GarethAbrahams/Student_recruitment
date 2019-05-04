package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.StaffAddressFactory;
import com.garethabrahams.factory.StaffCityFactory;
import com.garethabrahams.model.StaffAddress;
import com.garethabrahams.model.StaffCity;
import com.garethabrahams.repository.StaffAddressRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class StaffAddressRepositoryImplTest {
    private static StaffAddressRepository staffAddressRepository;
    private static StaffAddress address;
    private static Set<StaffAddress> AddressSet = new HashSet<>();

    @Test
    public void create() {
        staffAddressRepository = StaffAddressRepositoryImpl.getRepository();

        StaffCity city = StaffCityFactory.createStaffCity("Cape town");
        address = StaffAddressFactory.createStaffAddress("18 2nd Ave","Fairways",city);

        AddressSet.add(staffAddressRepository.create(address));

        Assert.assertEquals("18 2nd Ave",staffAddressRepository.read(address.getAddress()).getAddress());
    }

    @Test
    public void update() {
        create();
        StaffAddress gareth = staffAddressRepository.update(address);
        Assert.assertEquals(gareth.getAddress(),address.getAddress());
    }

    @Test
    public void delete() {
        create();
        StaffAddress gareth = staffAddressRepository.read(address.getAddress());
        staffAddressRepository.delete(gareth.getAddress());
        Assert.assertEquals(gareth,staffAddressRepository.read(address.getAddress()));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals("18 2nd Ave",staffAddressRepository.read(address.getAddress()).getAddress());
    }

}