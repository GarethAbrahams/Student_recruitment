package com.garethabrahams.service.Impl.Staff;

import com.garethabrahams.factory.Staff.StaffEmailFactory;
import com.garethabrahams.model.Staff.StaffEmail;
import com.garethabrahams.service.Staff.Impl.StaffEmailServiceImpl;
import com.garethabrahams.service.Staff.StaffEmailService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StaffEmailServiceImplTest {
    private static StaffEmailService service;
    private static StaffEmail email;
    private static Set<StaffEmail> emailSet = new HashSet<>();

    @Test
    public void getAll() {
        create();
        emailSet = service.getAll();
        Assert.assertNotNull(emailSet);
    }

    @Test
    public void create() {
        service = StaffEmailServiceImpl.getStaffEmailService();
        email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");

        emailSet.add(service.create(email));

        Assert.assertEquals("gareth@gmail.com",service.read(email.getEmail()).getEmail());
    }

    @Test
    public void read() {
        Assert.assertEquals("gareth@gmail.com",service.read(email.getEmail()).getEmail());
    }

    @Test
    public void update() {
        String newEmail = "tammy@gmail.com";
        System.out.println("before update, name = "+ email.getEmail());
        StaffEmail updated = new StaffEmail.Builder().copy(email).email(newEmail).build();
        System.out.println("After update(update), name = "+updated.getEmail());
        this.service.update(updated);
        Assert.assertSame(newEmail,updated.getEmail());
    }

    @Test
    public void delete() {
        service.delete(email.getEmail());
        Assert.assertNotNull(emailSet);
    }
}