package com.garethabrahams.repository.Impl.Staff;

import com.garethabrahams.factory.Staff.StaffCityFactory;
import com.garethabrahams.model.Staff.StaffCity;
import com.garethabrahams.repository.Staff.Impl.StaffCityRepositoryImpl;
import com.garethabrahams.repository.Staff.StaffCityRepository;
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
public class StaffCityRepositoryImplTest {
    @Autowired
    private static StaffCityRepository repository;
    private static StaffCity city;
    private String localCity;

    @Test
    public void create() throws IOException {
        repository = StaffCityRepositoryImpl.getRepository();

        city = StaffCityFactory.createStaffCity("Cape town");
        StaffCity result = repository.create(city);
        localCity = result.getCity();
        Assert.assertEquals(localCity,result.getCity());
    }

    @Test
    public void update() throws IOException {
        create();
        StaffCity result = repository.read(localCity);
        System.out.println("before update, name = " + result.getCity());
        String newCity = "Durban";
        StaffCity updated = new StaffCity.Builder().copy(result).city(newCity).build();
        System.out.println("After update(update), name = "+updated.getCity());
        this.repository.update(updated);

        Assert.assertSame(newCity,updated.getCity());
    }

    @Test
    public void delete() throws IOException {
        create();
        StaffCity result = repository.read(localCity);
        repository.delete(localCity);
        Assert.assertEquals(result,repository.read(localCity));
    }

    @Test
    public void read() throws IOException {
        create();
        StaffCity result = repository.read(localCity);
        Assert.assertEquals(localCity,result.getCity());
    }
}