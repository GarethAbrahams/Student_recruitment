package com.garethabrahams.factory.bridge;

import com.garethabrahams.factory.ApplicantFactory;
import com.garethabrahams.factory.ContactFactory;
import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.bridge.ApplicantContact;
import com.garethabrahams.model.Contact;
import org.junit.Assert;
import org.junit.Test;

public class ApplicantContactFactoryTest {

    @Test
    public void createApplicantContact() {

        Applicant applicant = ApplicantFactory.createApplicant("Gareth","Abrahams", "1234567890");
        String appID = applicant.getApplicantID();

        Contact contact = ContactFactory.createContact("0211234567","0824567892");
        String conID = contact.getContactID();

        ApplicantContact appCon = ApplicantContactFactory.createApplicantContact(appID,conID);

        Assert.assertEquals(appID,appCon.getApplicantID());
    }
}