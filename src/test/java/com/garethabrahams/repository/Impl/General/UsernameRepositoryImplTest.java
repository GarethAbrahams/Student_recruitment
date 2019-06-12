package com.garethabrahams.repository.Impl.General;

import com.garethabrahams.factory.General.DepartmentFactory;
import com.garethabrahams.factory.General.RolesFactory;
import com.garethabrahams.factory.General.UsernameFactory;
import com.garethabrahams.factory.Staff.*;
import com.garethabrahams.model.General.Department;
import com.garethabrahams.model.General.Roles;
import com.garethabrahams.model.General.Username;
import com.garethabrahams.model.Staff.*;
import com.garethabrahams.repository.General.Impl.UsernameRepositoryImpl;
import com.garethabrahams.repository.General.UsernameRepository;
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
public class UsernameRepositoryImplTest {
    @Autowired
    private static UsernameRepository repository;
    private static Username gareth;
    private String localUsername;

    @Test
    public void create() throws IOException {

        repository = UsernameRepositoryImpl.getRepository();

        Roles role = RolesFactory.createRoles("developer");
        Department dept = DepartmentFactory.createDepartment("Techops");
        StaffEmail email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");
        StaffContact contact = StaffContactFactory.createStaffContact("0214563214","0824569874");
        StaffCity city = StaffCityFactory.createStaffCity("Cape Town");
        StaffAddress address = StaffAddressFactory.createStaffAddress("18 2nd Ave","Fairways",city);

        Staff Gareth = StaffFactory.createStaff("123","Gareth","Abrahams","805214456897",address,contact,email,dept,role);

        gareth = UsernameFactory.createAccounts("gareth1234",Gareth);
        Username result = repository.create(gareth);
        localUsername = result.getUsername();
        Assert.assertEquals(localUsername,result.getUsername());

    }

    @Test
    public void update() throws IOException {
        create();
        Username result = repository.read(localUsername);
        System.out.println("before update, name = " + result.getUsername());
        String newUsername = "gareth5555";
        Username updated = new Username.Builder().copy(result).username(newUsername).build();
        System.out.println("After update(update), name = "+updated.getUsername());
        this.repository.update(updated);

        Assert.assertSame(newUsername,updated.getUsername());
    }

    @Test
    public void delete() throws IOException {
        create();
        Username result = repository.read(localUsername);
        repository.delete(localUsername);
        Assert.assertEquals(result,repository.read(localUsername));
    }

    @Test
    public void read() throws IOException {
        create();
        Username result = repository.read(localUsername);
        Assert.assertEquals(localUsername,result.getUsername());
    }
}