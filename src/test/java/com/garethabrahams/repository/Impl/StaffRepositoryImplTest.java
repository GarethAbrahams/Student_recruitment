package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.*;
import com.garethabrahams.model.*;
import com.garethabrahams.repository.StaffRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class StaffRepositoryImplTest {
    private static StaffRepository staffRepository;
    private static Staff gareth;
    private static Set<Staff> employeeSet = new HashSet<>();
    @Test
    public void create() {

        staffRepository = StaffRepositoryImpl.getRepository();

        Roles role = RolesFactory.createRoles("developer");
        Department dept = DepartmentFactory.createDepartment("Techops");
        StaffEmail email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");
        StaffContact contact = StaffContactFactory.createStaffContact("0214563214","0824569874");
        StaffCity city = StaffCityFactory.createStaffCity("Cape Town");
        StaffAddress address = StaffAddressFactory.createStaffAddress("18 2nd Ave","Fairways",city);

        gareth = StaffFactory.createStaff("123","Gareth","Abrahams","805214456897",address,contact,email,dept,role);

        employeeSet.add(staffRepository.create(gareth));

        Assert.assertEquals(gareth.getEmployeeID(),staffRepository.read(gareth.getEmployeeID()).getEmployeeID());

    }

    @Test
    public void update() {
        create();
        Staff user = staffRepository.update(gareth);
        Assert.assertEquals(user.getEmployeeID(),gareth.getEmployeeID());
    }

    @Test
    public void delete() {
        create();
        Staff user = staffRepository.read(gareth.getEmployeeID());
        staffRepository.delete(user.getEmployeeID());
        Assert.assertEquals(user,staffRepository.read(gareth.getEmployeeID()));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals(gareth.getEmployeeID(),staffRepository.read(gareth.getEmployeeID()).getEmployeeID());
    }
}