package com.garethabrahams.repository.impl;

import com.garethabrahams.factory.EmailFactory;
import com.garethabrahams.model.Email;
import com.garethabrahams.repository.EmailRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class EmailRepositoryImplTest {
    private static EmailRepository repository;
    private static Email email;
    private String id;

    @Before
    @Test
    public void create() {
        repository = EmailRepositoryImpl.getRepository();

        email = EmailFactory.createEmail("gareth@gmail.com");
        id = email.getEmailID();
        Email result = repository.create(email);
        Assert.assertEquals(id,result.getEmailID());
    }

    @Test
    public void getAll() {
        Set<Email> result = repository.getAll();
        Assert.assertNotNull(result);
    }

    @Test
    public void update() {
        Email result = repository.read(id);
        String emailUpdate = "ga@gmail.com";
        Email newEmail = new Email.Builder().copy(result).email(emailUpdate).build();
        Email newRead = repository.update(newEmail);

        Assert.assertEquals(id,newRead.getEmailID());
        Assert.assertEquals(emailUpdate,newRead.getEmail());
    }

    @Test
    public void delete() {
        Email result = repository.read(id);
        repository.delete(id);
        Email newResult = repository.read(id);
        Assert.assertNull(newResult);
    }

    @Test
    public void read() {
        Email result = repository.read(id);
        Assert.assertEquals(id,result.getEmailID());
    }
}