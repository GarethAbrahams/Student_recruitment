package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.Staff.StaffAddressFactory;
import com.garethabrahams.factory.Staff.StaffCityFactory;
import com.garethabrahams.model.Staff.StaffAddress;
import com.garethabrahams.model.Staff.StaffCity;
import com.garethabrahams.repository.StaffAddressRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

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