package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.Applicant.ApplicantCityFactory;
import com.garethabrahams.factory.Applicant.ApplicatantAddressFactory;
import com.garethabrahams.model.Applicant.ApplicantAddress;
import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.repository.ApplicantAddressRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantAddressRepositoryImplTest {

    private static ApplicantAddressRepository applicantAddressRepository;
    private static ApplicantAddress address;
    private static Set<ApplicantAddress> addressSet = new HashSet<>();

    @Test
    public void create() {

        applicantAddressRepository = ApplicantAddressRepositoryImpl.getRepository();

        ApplicantCity city = ApplicantCityFactory.creatApplicantCity("Cape Town");
        address = ApplicatantAddressFactory.createApplicatantAddress("18 2nd Avenue","Fairways",city);

        addressSet.add(applicantAddressRepository.create(address));

        Assert.assertEquals(address.getCity(),applicantAddressRepository.read(address.getAddress()).getCity());

    }

    @Test
    public void update() {
        create();
        ApplicantAddress add = applicantAddressRepository.update(address);
        Assert.assertEquals(add.getAddress(),applicantAddressRepository.read("18 2nd Avenue").getAddress());
    }

    @Test
    public void delete() {
        create();
        ApplicantAddress add = applicantAddressRepository.read(address.getAddress());
        applicantAddressRepository.delete(add.getAddress());
        Assert.assertEquals(add.getAddress(),applicantAddressRepository.read("18 2nd Avenue").getAddress());
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals(address.getAddress(),applicantAddressRepository.read("18 2nd Avenue").getAddress());
    }
}