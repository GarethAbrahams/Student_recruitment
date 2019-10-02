package com.garethabrahams.repository.bridge.Impl;

import com.garethabrahams.factory.AddressFactory;
import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.bridge.ApplicantAddressFactory;
import com.garethabrahams.model.Address;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.bridge.ApplicantAddress;
import com.garethabrahams.repository.bridge.ApplicantAddressRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantAddressRepositoryImplTest {

    private static ApplicantAddressRepository repository;
    private static ApplicantAddress appAddress;
    private String applicantID;

    @Before
    @Test
    public void create() {
        repository = ApplicantAddressRepositoryImpl.getRepository();

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams","1234567890");
        Address address = AddressFactory.createAddress("100 Main Rd", "Newlands","Cape Town");
        appAddress = ApplicantAddressFactory.createApplicantAddress(applicant.getApplicantID(),address.getAddressID());
        applicantID = applicant.getApplicantID();
        ApplicantAddress result = repository.create(appAddress);
        Assert.assertEquals(applicantID,result.getApplicantID());
    }

    @Test
    public void read() {
        ApplicantAddress result = repository.read(applicantID);
        Assert.assertEquals(applicantID,result.getApplicantID());

    }

    @Test
    public void update() {
        ApplicantAddress result = repository.read(applicantID);
        Address newAddress = AddressFactory.createAddress("240 Main Rd", "Newlands","Cape Town");
        String newAddID = newAddress.getAddressID();
        ApplicantAddress update = new ApplicantAddress.Builder().copy(result).addressID(newAddID).build();
        ApplicantAddress newResult = repository.update(update);

        Assert.assertEquals(applicantID,newResult.getApplicantID());
        Assert.assertEquals(newAddID,newResult.getAddressID());

    }

    @Test
    public void delete() {
        ApplicantAddress result = repository.read(applicantID);
        repository.delete(applicantID);
        ApplicantAddress newResult = repository.read(applicantID);
        Assert.assertNull(newResult);
    }

    @Test
    public void getAll() {
        Set<ApplicantAddress> result = repository.getAll();
        Assert.assertNotNull(result);
    }
}