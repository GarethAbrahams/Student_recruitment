package com.garethabrahams.factory;

import com.garethabrahams.model.Contact;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ContactFactoryTest {

    @Test
    public void createContact() {

        Contact contact = ContactFactory.createContact("0211234567","0824567892");
        String id = contact.getContactID();

        Assert.assertEquals(id,contact.getContactID());
    }
}