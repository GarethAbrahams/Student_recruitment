package com.garethabrahams.repository.Impl.Applicant;

import com.garethabrahams.factory.Applicant.ApplicantEmailFactory;
import com.garethabrahams.model.Applicant.ApplicantEmail;
import com.garethabrahams.repository.Applicant.ApplicantEmailRepository;
import com.garethabrahams.repository.Applicant.Impl.ApplicantEmailRepositoryImpl;
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
public class ApplicantEmailRepositoryImplTest {
    @Autowired
    private static ApplicantEmailRepository repository;
    private static ApplicantEmail email;
    private String emailAddress;

    @Test
    public void create() throws IOException {
        repository = ApplicantEmailRepositoryImpl.getRepository();
        email = ApplicantEmailFactory.createApplicantEmail("gareth@gmail.com");
        ApplicantEmail result = repository.create(email);
        emailAddress = result.getEmail();
        Assert.assertEquals(emailAddress,result.getEmail());

    }

    @Test
    public void update() throws IOException {
        create();
        ApplicantEmail result = repository.read(emailAddress);
        System.out.println("before update, name = "+result.getEmail());

        String newEmail = "tammy@gmail.com";
        ApplicantEmail updated = new ApplicantEmail.Builder().copy(result).email(newEmail).build();
        System.out.println("After update(update), name = "+updated.getEmail());
        this.repository.update(updated);
        Assert.assertSame(newEmail,updated.getEmail());

    }

    @Test
    public void delete() throws IOException {
        create();
        ApplicantEmail result = repository.read(emailAddress);
        repository.delete(emailAddress);
        Assert.assertEquals(emailAddress,result.getEmail());
    }

    @Test
    public void read() throws IOException {
        create();
        ApplicantEmail result = repository.read(emailAddress);
        Assert.assertEquals(result.getEmail(),emailAddress);
    }
}