package com.garethabrahams.factory.Applicant;

import com.garethabrahams.model.Applicant.ApplicatantAddress;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplicatantAddressFactoryTest {

    @Test
    public void createApplicatantAddress() {
        ApplicatantAddress address = ApplicatantAddressFactory.createApplicatantAddress("CPT");
        Assert.assertEquals("CPT",address.getAddress());
    }
}