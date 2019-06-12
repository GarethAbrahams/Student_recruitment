package com.garethabrahams.repository.Impl.Staff;

import com.garethabrahams.factory.General.DepartmentFactory;
import com.garethabrahams.factory.General.RolesFactory;
import com.garethabrahams.factory.Staff.*;
import com.garethabrahams.model.General.Department;
import com.garethabrahams.model.General.Roles;
import com.garethabrahams.model.Staff.*;
import com.garethabrahams.repository.Staff.Impl.StaffRepositoryImpl;
import com.garethabrahams.repository.Staff.StaffRepository;
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
public class StaffRepositoryImplTest {
    @Autowired
    private static StaffRepository repository;
    private static Staff gareth;
    private String localStaff;
    @Test
    public void create() throws IOException {

        repository = StaffRepositoryImpl.getRepository();

        Roles role = RolesFactory.createRoles("developer");
        Department dept = DepartmentFactory.createDepartment("Techops");
        StaffEmail email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");
        StaffContact contact = StaffContactFactory.createStaffContact("0214563214","0824569874");
        StaffCity city = StaffCityFactory.createStaffCity("Cape Town");
        StaffAddress address = StaffAddressFactory.createStaffAddress("18 2nd Ave","Fairways",city);

        gareth = StaffFactory.createStaff("123","Gareth","Abrahams","805214456897",address,contact,email,dept,role);
        Staff result = repository.create(gareth);
        localStaff = result.getEmployeeID();
        Assert.assertEquals(localStaff,gareth.getEmployeeID());
    }

    @Test
    public void update() throws IOException {
        create();
        Staff result = repository.read(localStaff);
        System.out.println("before update, name = " + result.getSurname());
        String NewSurname = "Gates";
        Staff updated = new Staff.Builder().copy(result).surname(NewSurname).build();
        System.out.println("After update(update), name = "+updated.getSurname());
        this.repository.update(updated);

        Assert.assertSame(NewSurname,repository.read(localStaff).getSurname());
    }

    @Test
    public void delete() throws IOException {
        create();
        Staff result = repository.read(localStaff);
        repository.delete(localStaff);
        Assert.assertEquals(result,repository.read(localStaff));
    }

    @Test
    public void read() throws IOException {
        create();
        Staff result = repository.read(localStaff);
        Assert.assertEquals(localStaff,result.getEmployeeID());
    }
}