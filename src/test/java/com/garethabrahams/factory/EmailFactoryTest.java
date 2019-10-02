package com.garethabrahams.factory;

import com.garethabrahams.model.Email;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmailFactoryTest {

    @Test
    public void createEmail() {

        Email email = EmailFactory.createEmail("gareth@gmail.com");
        String id = email.getEmailID();

        Assert.assertEquals(id,email.getEmailID());
    }
}