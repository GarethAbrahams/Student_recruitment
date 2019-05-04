package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.ApplicantEmailFactory;
import com.garethabrahams.model.ApplicantEmail;
import com.garethabrahams.repository.ApplicantEmailRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class ApplicantEmailRepositoryImplTest {

    private static ApplicantEmailRepository applicantEmailRepository;
    private static ApplicantEmail email;
    private static Set<ApplicantEmail> emailSet = new HashSet<>();

    @Test
    public void create() {
        applicantEmailRepository = ApplicantEmailRepositoryImpl.getRepository();
        email = ApplicantEmailFactory.createApplicantEmail("gareth@gmail.com");
        emailSet.add(applicantEmailRepository.create(email));

        Assert.assertEquals(email.getEmail(),applicantEmailRepository.read(email.getEmail()).getEmail());
    }

    @Test
    public void update() {
        create();
        ApplicantEmail emailtemp = applicantEmailRepository.update(email);
        Assert.assertEquals(emailtemp.getEmail(),email.getEmail());
    }

    @Test
    public void delete() {
        create();
        ApplicantEmail emailtemp = applicantEmailRepository.read(email.getEmail());
        applicantEmailRepository.delete(emailtemp.getEmail());
        Assert.assertEquals(emailtemp,applicantEmailRepository.read("gareth@gmail.com"));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals(email.getEmail(),applicantEmailRepository.read("gareth@gmail.com").getEmail());
    }
}