package com.garethabrahams.service.Impl.General;

import com.garethabrahams.factory.General.DepartmentFactory;
import com.garethabrahams.factory.General.RolesFactory;
import com.garethabrahams.factory.General.UsernameFactory;
import com.garethabrahams.factory.Staff.*;
import com.garethabrahams.model.General.Department;
import com.garethabrahams.model.General.Roles;
import com.garethabrahams.model.General.Username;
import com.garethabrahams.model.Staff.*;
import com.garethabrahams.service.General.Impl.UsernameServiceImpl;
import com.garethabrahams.service.General.UsernameService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UsernameServiceImplTest {
    private static UsernameService service;
    private static Username username;
    private static Set<Username> usernameSet = new HashSet<>();

    @Test
    public void getAll() {
        create();
        usernameSet = service.getAll();
        Assert.assertNotNull(usernameSet);
    }

    @Test
    public void create() {
        service = UsernameServiceImpl.getUsernameService();

        Roles role = RolesFactory.createRoles("developer");
        Department dept = DepartmentFactory.createDepartment("Techops");
        StaffEmail email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");
        StaffContact contact = StaffContactFactory.createStaffContact("0214563214","0824569874");
        StaffCity city = StaffCityFactory.createStaffCity("Cape Town");
        StaffAddress address = StaffAddressFactory.createStaffAddress("18 2nd Ave","Fairways",city);

        Staff Gareth = StaffFactory.createStaff("123","Gareth","Abrahams","805214456897",address,contact,email,dept,role);

        username = UsernameFactory.createAccounts("gareth1234",Gareth);

        usernameSet.add(service.create(username));

        Assert.assertEquals("gareth1234",service.read(username.getUsername()).getUsername());
    }

    @Test
    public void read() {
        Assert.assertEquals("gareth1234",service.read(username.getUsername()).getUsername());
    }

    @Test
    public void update() {
        String newUsername = "Tammy3652";
        System.out.println("before update, name = "+username.getUsername());
        Username updated = new Username.Builder().copy(username).username(newUsername).build();
        System.out.println("After update(update), name = "+updated.getUsername());
        this.service.update(updated);
        Assert.assertSame(newUsername,updated.getUsername());
    }

    @Test
    public void delete() {
        service.delete(username.getUsername());
        Assert.assertNotNull(usernameSet);
    }
}