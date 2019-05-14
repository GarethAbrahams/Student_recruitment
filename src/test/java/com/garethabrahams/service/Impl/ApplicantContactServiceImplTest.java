package com.garethabrahams.service.Impl;

import com.garethabrahams.factory.ApplicantContactFactory;
import com.garethabrahams.model.ApplicantContact;
import com.garethabrahams.service.ApplicantContactService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class ApplicantContactServiceImplTest {

    private static ApplicantContactService service;
    private static ApplicantContact contact;
    private static Set<ApplicantContact> contactSet = new HashSet<>();

    @Before
    public void createContacts(){
        service = ApplicantContactServiceImpl.getApplicantContactService();

        contact = ApplicantContactFactory.createApplicantContact("0212563254","0821234568");

    }


    @Test
    public void getAll() {
        contactSet = service.getAll();
        Assert.assertNotNull(contactSet);
    }

    @Test
    public void create() {
        contactSet.add(service.create(contact));
        Assert.assertEquals("0821234568",service.read(contact.getCellphone()).getCellphone());
    }

    @Test
    public void read() {
        Assert.assertEquals("0821234568",service.read(contact.getCellphone()).getCellphone());
    }

    @Test
    public void update() {
        String newContact = "0836985214";
        System.out.println("before update, name = "+contact.getCellphone());
        ApplicantContact updated = new ApplicantContact.Builder().copy(contact).cellphone(newContact).build();
        System.out.println("After update(update), name = "+updated.getCellphone());
        this.service.update(updated);
        Assert.assertSame(newContact,updated.getCellphone());

    }

    @Test
    public void delete() {
        service.delete(contact.getCellphone());
        contactSet = service.getAll();
        Assert.assertNotNull(contactSet);
    }
}