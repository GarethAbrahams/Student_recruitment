package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.Staff.StaffEmailFactory;
import com.garethabrahams.model.Staff.StaffEmail;
import com.garethabrahams.repository.StaffEmailRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class StaffEmailRepositoryImplTest {
    private static StaffEmailRepository staffEmailRepository;
    private static StaffEmail email;
    private static Set<StaffEmail> EmailSet = new HashSet<>();

    @Test
    public void create() {

        staffEmailRepository = StaffEmailRepositoryImpl.getRepository();
        email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");

        EmailSet.add(staffEmailRepository.create(email));

        Assert.assertEquals(email.getEmail(),staffEmailRepository.read(email.getEmail()).getEmail());
    }

    @Test
    public void update() {
        create();
        StaffEmail user = staffEmailRepository.update(email);
        Assert.assertEquals(user.getEmail(),email.getEmail());
    }

    @Test
    public void delete() {
        create();
        StaffEmail user = staffEmailRepository.read(email.getEmail());
        staffEmailRepository.delete(user.getEmail());
        Assert.assertEquals(user,staffEmailRepository.read(email.getEmail()));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals(email.getEmail(),staffEmailRepository.read("gareth@gmail.com").getEmail());
    }
}