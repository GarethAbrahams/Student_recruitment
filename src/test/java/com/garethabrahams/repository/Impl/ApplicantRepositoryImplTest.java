package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.*;
import com.garethabrahams.model.*;
import com.garethabrahams.repository.ApplicantRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class ApplicantRepositoryImplTest {
        private static ApplicantRepository applicantRepository;
        private static Applicant gareth;
        private static Set<Applicant> Applicants = new HashSet<>();
    @Test
    public void create() {

        applicantRepository = ApplicantRepositoryImpl.getRepository();

        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        ApplicantAddress address = ApplicatantAddressFactory.createApplicatantAddress("18 2nd Avenue","Fairways",city);
        ApplicantContact contact = ApplicantContactFactory.createApplicantContact("0212563254","0821234568");
        ApplicantEmail email = ApplicantEmailFactory.createApplicantEmail("gareth@gmail.com");

        gareth = ApplicantFactory.createApplicant("Gareth", "Abrahams", "1234657980", address, contact, email);

        Applicants.add(applicantRepository.create(gareth));

        Assert.assertEquals(gareth.getId(),applicantRepository.read(gareth.getId()).getId());
    }

    @Test
    public void update() {
        create();
        Applicant applicant = applicantRepository.update(gareth);
        Assert.assertEquals(applicant.getId(),gareth.getId());
    }

    @Test
    public void delete() {
        create();
        Applicant applicant = applicantRepository.read(gareth.getId());
        applicantRepository.delete(applicant.getId());
        Assert.assertEquals(applicant,applicantRepository.read("1234657980"));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals(gareth.getEmail(),applicantRepository.read(gareth.getId()).getEmail());

    }
}