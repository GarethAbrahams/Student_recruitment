package com.garethabrahams.repository.Impl.Staff;

import com.garethabrahams.factory.Staff.StaffAddressFactory;
import com.garethabrahams.factory.Staff.StaffCityFactory;
import com.garethabrahams.model.Staff.StaffAddress;
import com.garethabrahams.model.Staff.StaffCity;
import com.garethabrahams.repository.Staff.Impl.StaffAddressRepositoryImpl;
import com.garethabrahams.repository.Staff.StaffAddressRepository;
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
public class StaffAddressRepositoryImplTest {
    @Autowired
    private static StaffAddressRepository repository;
    private static StaffAddress address;
    private String localAddress;

    @Test
    public void create() throws IOException {
        repository = StaffAddressRepositoryImpl.getRepository();

        StaffCity city = StaffCityFactory.createStaffCity("Cape town");
        address = StaffAddressFactory.createStaffAddress("18 2nd Ave","Fairways",city);
        StaffAddress result = repository.create(address);
        localAddress = result.getAddress();
        Assert.assertEquals(localAddress,result.getAddress());
    }

    @Test
    public void update() throws IOException {
        create();
        StaffAddress result = repository.read(localAddress);
        System.out.println("before update, name = " + result.getAddress());
        String newAddress = "4 Apricot Lane";
        StaffAddress updated = new StaffAddress.Builder().copy(result).address(newAddress).build();
        System.out.println("After update(update), name = "+updated.getAddress());
        this.repository.update(updated);

        Assert.assertSame(newAddress,updated.getAddress());
    }

    @Test
    public void delete() throws IOException {
        create();
        StaffAddress result = repository.read(localAddress);
        repository.delete(localAddress);
        Assert.assertEquals(result,repository.read(localAddress));
    }

    @Test
    public void read() throws IOException {
        create();
        StaffAddress result = repository.read(localAddress);
        Assert.assertEquals(localAddress,result.getAddress());
    }

}