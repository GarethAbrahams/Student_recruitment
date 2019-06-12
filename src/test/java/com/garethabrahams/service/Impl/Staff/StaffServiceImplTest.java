package com.garethabrahams.service.Impl.Staff;

import com.garethabrahams.factory.General.DepartmentFactory;
import com.garethabrahams.factory.General.RolesFactory;
import com.garethabrahams.factory.Staff.*;
import com.garethabrahams.model.General.Department;
import com.garethabrahams.model.General.Roles;
import com.garethabrahams.model.Staff.*;
import com.garethabrahams.service.Staff.Impl.StaffServiceImpl;
import com.garethabrahams.service.Staff.StaffService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StaffServiceImplTest {
    private static StaffService service;
    private static Staff staff;
    private static Set<Staff> staffSet = new HashSet<>();

    @Test
    public void getAll() {
        create();
        staffSet = service.getAll();
        Assert.assertNotNull(staffSet);
    }

    @Test
    public void create() {

        service = StaffServiceImpl.getStaffService();

        Roles role = RolesFactory.createRoles("developer");
        Department dept = DepartmentFactory.createDepartment("Techops");
        StaffEmail email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");
        StaffContact contact = StaffContactFactory.createStaffContact("0214563214","0824569874");
        StaffCity city = StaffCityFactory.createStaffCity("Cape Town");
        StaffAddress address = StaffAddressFactory.createStaffAddress("18 2nd Ave","Fairways",city);

        staff = StaffFactory.createStaff("123","Gareth","Abrahams","805214456897",address,contact,email,dept,role);

        staffSet.add(service.create(staff));

        Assert.assertEquals("123",service.read(staff.getEmployeeID()).getEmployeeID());
    }

    @Test
    public void read() {
        Assert.assertEquals("123",service.read(staff.getEmployeeID()).getEmployeeID());
    }

    @Test
    public void update() {
        String newName = "Tammy";
        System.out.println("before update, name = "+staff.getName());
        Staff updated = new Staff.Builder().copy(staff).name(newName).build();
        System.out.println("After update(update), name = "+updated.getName());
        this.service.update(updated);
        Assert.assertSame(newName,updated.getName());
    }

    @Test
    public void delete() {
        service.delete(staff.getEmployeeID());
        Assert.assertNotNull(staffSet);
    }
}