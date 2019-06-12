package com.garethabrahams.service.Impl.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantEmailFactory;
import com.garethabrahams.model.Applicant.ApplicantEmail;
import com.garethabrahams.service.Applicant.ApplicantEmailService;
import com.garethabrahams.service.Applicant.Impl.ApplicantEmailServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.util.HashSet;
import java.util.Set;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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