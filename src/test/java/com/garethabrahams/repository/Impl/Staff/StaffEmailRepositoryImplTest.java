package com.garethabrahams.repository.Impl.Staff;

import com.garethabrahams.factory.Staff.StaffEmailFactory;
import com.garethabrahams.model.Staff.StaffEmail;
import com.garethabrahams.repository.Staff.Impl.StaffEmailRepositoryImpl;
import com.garethabrahams.repository.Staff.StaffEmailRepository;
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
public class StaffEmailRepositoryImplTest {
    @Autowired
    private static StaffEmailRepository repository;
    private static StaffEmail email;
    private String localEmail;

    @Test
    public void create() throws IOException {

        repository = StaffEmailRepositoryImpl.getRepository();
        email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");
        StaffEmail result = repository.create(email);
        localEmail = result.getEmail();
        Assert.assertEquals(localEmail,result.getEmail());
    }

    @Test
    public void update() throws IOException {
        create();
        StaffEmail result = repository.read(localEmail);
        System.out.println("before update, name = " + result.getEmail());
        String newEmail = "tammy@gmail.com";
        StaffEmail updated = new StaffEmail.Builder().copy(result).email(newEmail).build();
        System.out.println("After update(update), name = "+updated.getEmail());
        this.repository.update(updated);

        Assert.assertSame(newEmail,updated.getEmail());
    }

    @Test
    public void delete() throws IOException {
        create();
        StaffEmail result = repository.read(localEmail);
        repository.delete(localEmail);
        Assert.assertEquals(result,repository.read(localEmail));
    }

    @Test
    public void read() throws IOException {
        create();
        StaffEmail result = repository.read(localEmail);
        Assert.assertEquals(localEmail,result.getEmail());
    }
}