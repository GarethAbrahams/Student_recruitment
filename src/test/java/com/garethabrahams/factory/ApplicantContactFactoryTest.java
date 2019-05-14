package com.garethabrahams.factory;

import com.garethabrahams.factory.ApplicantContactFactory;
import com.garethabrahams.model.ApplicantContact;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantContactFactoryTest {

    @Test
    public void createApplicantContact() {

        ApplicantContact contact = ApplicantContactFactory.createApplicantContact("0214561235","0824568747");
        Assert.assertEquals("0214561235",contact.getPhone());
    }
}