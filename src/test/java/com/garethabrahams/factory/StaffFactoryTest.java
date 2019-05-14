package com.garethabrahams.factory;

import com.garethabrahams.factory.*;
import com.garethabrahams.model.*;
import org.junit.Assert;
import org.junit.Test;

public class StaffFactoryTest {

    @Test
    public void createStaff() {
        Roles role = RolesFactory.createRoles("developer");
        Department dept = DepartmentFactory.createDepartment("Techops");
        StaffEmail email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");
        StaffContact contact = StaffContactFactory.createStaffContact("0214563214","0824569874");
        StaffCity city = StaffCityFactory.createStaffCity("Cape Town");
        StaffAddress address = StaffAddressFactory.createStaffAddress("18 2nd Ave","Fairways",city);

        Staff gareth = StaffFactory.createStaff("123","Gareth","Abrahams","805214456897",address,contact,email,dept,role);

        Assert.assertEquals("Gareth",gareth.getName());
    }
}