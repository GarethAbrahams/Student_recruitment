package com.garethabrahams.factory.bridge;

import com.garethabrahams.factory.AddressFactory;
import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.model.Address;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.bridge.ApplicantAddress;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantAddressFactoryTest {

    @Test
    public void createApplicantAddress() {

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams", "1234567890");
        String appID = applicant.getApplicantID();

        Address address = AddressFactory.createAddress("100 Main Rd", "Newlands","Cape Town");
        String addID = address.getAddressID();

        ApplicantAddress appAdd = ApplicantAddressFactory.createApplicantAddress(appID,addID);
        Assert.assertEquals(appID,appAdd.getApplicantID());
    }
}