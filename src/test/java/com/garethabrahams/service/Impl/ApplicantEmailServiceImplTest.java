package com.garethabrahams.service.Impl;

import com.garethabrahams.factory.ApplicantEmailFactory;
import com.garethabrahams.model.ApplicantEmail;
import com.garethabrahams.service.ApplicantEmailService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantEmailServiceImplTest {

    private static ApplicantEmailService service;
    private static ApplicantEmail email;
    private static Set<ApplicantEmail> emailSet = new HashSet<>();

    @Before
    public void createEmails(){
        service = ApplicantEmailServiceImpl.getApplicantEmailService();
        email = ApplicantEmailFactory.createApplicantEmail("gareth@gmail.com");

    }

    @Test
    public void getAll() {
        emailSet = service.getAll();
        Assert.assertNotNull(emailSet);
    }

    @Test
    public void create() {
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
        System.out.println("before update, name = "+email.getEmail());
        ApplicantEmail updated = new ApplicantEmail.Builder().copy(email).email(newEmail).build();
        System.out.println("After update(update), name = "+updated.getEmail());
        this.service.update(updated);
        Assert.assertSame(newEmail,updated.getEmail());
    }

    @Test
    public void delete() {
        service.delete(email.getEmail());
        emailSet = service.getAll();
        Assert.assertNotNull(emailSet);
    }
}