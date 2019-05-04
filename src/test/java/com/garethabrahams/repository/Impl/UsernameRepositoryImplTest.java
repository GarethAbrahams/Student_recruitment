package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.*;
import com.garethabrahams.model.*;
import com.garethabrahams.repository.UsernameRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class UsernameRepositoryImplTest {
    private static UsernameRepository usernameRepository;
    private static Username gareth;
    private static Set<Username> usernameSet = new HashSet<>();

    @Test
    public void create() {

        usernameRepository = UsernameRepositoryImpl.getRepository();

        Roles role = RolesFactory.createRoles("developer");
        Department dept = DepartmentFactory.createDepartment("Techops");
        StaffEmail email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");
        StaffContact contact = StaffContactFactory.createStaffContact("0214563214","0824569874");
        StaffCity city = StaffCityFactory.createStaffCity("Cape Town");
        StaffAddress address = StaffAddressFactory.createStaffAddress("18 2nd Ave","Fairways",city);

        Staff Gareth = StaffFactory.createStaff("123","Gareth","Abrahams","805214456897",address,contact,email,dept,role);

        gareth = UsernameFactory.createAccounts("gareth1234",Gareth);

        usernameSet.add(usernameRepository.create(gareth));

        Assert.assertEquals(gareth.getUsername(),usernameRepository.read(gareth.getUsername()).getUsername());


    }

    @Test
    public void update() {
        create();
        Username user = usernameRepository.update(gareth);
        Assert.assertEquals(user.getUsername(),gareth.getUsername());
    }

    @Test
    public void delete() {
        create();
        Username user = usernameRepository.read(gareth.getUsername());
        usernameRepository.delete(user.getUsername());
        Assert.assertEquals(user,usernameRepository.read("gareth1234"));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals(gareth.getUsername(),usernameRepository.read("gareth1234").getUsername());
    }
}