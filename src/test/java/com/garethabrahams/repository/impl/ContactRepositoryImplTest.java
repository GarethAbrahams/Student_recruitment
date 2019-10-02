package com.garethabrahams.repository.impl;

import com.garethabrahams.factory.ContactFactory;
import com.garethabrahams.model.Contact;
import com.garethabrahams.repository.ContactRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class ContactRepositoryImplTest {

    private static ContactRepository repository;
    private static Contact contact;
    private String id;

    @Before
    @Test
    public void create() {
        repository = ContactRepositoryImpl.getRepository();

        contact = ContactFactory.createContact("0215552356","0829876541");
        id = contact.getContactID();
        Contact result = repository.create(contact);
        Assert.assertEquals(id,result.getContactID());
    }

    @Test
    public void getAll() {
        Set<Contact> result = repository.getAll();
        Assert.assertNotNull(result);
    }

    @Test
    public void update() {
        Contact result = repository.read(id);
        String newNum = "0826541236";
        Contact newCell = new Contact.Builder().copy(result).cellphone(newNum).build();
        Contact newRead = repository.update(newCell);

        Assert.assertEquals(id,newRead.getContactID());
        Assert.assertEquals(newNum,newRead.getCellphone());
    }

    @Test
    public void delete() {
        Contact result = repository.read(id);
        repository.delete(id);
        Contact newResult = repository.read(id);
        Assert.assertNull(newResult);
    }

    @Test
    public void read() {
        Contact result = repository.read(id);
        Assert.assertEquals(id,result.getContactID());
    }
}