package com.garethabrahams.factory.General;

import com.garethabrahams.factory.General.DepartmentFactory;
import com.garethabrahams.factory.General.RolesFactory;
import com.garethabrahams.factory.General.UsernameFactory;
import com.garethabrahams.factory.Staff.*;
import com.garethabrahams.model.General.Department;
import com.garethabrahams.model.General.Roles;
import com.garethabrahams.model.General.Username;
import com.garethabrahams.model.Staff.*;
import org.junit.Assert;
import org.junit.Test;

public class UsernameFactoryTest {

    @Test
    public void createAccounts() {

        Roles role = RolesFactory.createRoles("developer");
        Department dept = DepartmentFactory.createDepartment("Techops");
        StaffEmail email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");
        StaffContact contact = StaffContactFactory.createStaffContact("0214563214","0824569874");
        StaffCity city = StaffCityFactory.createStaffCity("Cape Town");
        StaffAddress address = StaffAddressFactory.createStaffAddress("18 2nd Ave","Fairways",city);

        Staff gareth = StaffFactory.createStaff("123","Gareth","Abrahams","805214456897",address,contact,email,dept,role);

        Username acc = UsernameFactory.createAccounts("gareth1234",gareth);
        Assert.assertEquals("gareth1234",acc.getUsername());
    }
}