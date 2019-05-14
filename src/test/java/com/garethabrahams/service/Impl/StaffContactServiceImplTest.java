package com.garethabrahams.service.Impl;

import com.garethabrahams.factory.StaffContactFactory;
import com.garethabrahams.model.StaffContact;
import com.garethabrahams.service.StaffContactService;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class StaffContactServiceImplTest {
    private static StaffContactService service;
    private static StaffContact contact;
    private static Set<StaffContact> contactSet = new HashSet<>();

    @Test
    public void getAll() {
        create();
        contactSet = service.getAll();
        Assert.assertNotNull(contactSet);
    }

    @Test
    public void create() {
        service = StaffContactServiceImpl.getStaffContactService();
        contact = StaffContactFactory.createStaffContact("0211234568","0824567895");

        contactSet.add(service.create(contact));

        Assert.assertEquals("0824567895",service.read(contact.getCellphone()).getCellphone());
    }

    @Test
    public void read() {
        Assert.assertEquals("0824567895",service.read(contact.getCellphone()).getCellphone());
    }

    @Test
    public void update() {
        String newContact = "0824569874";
        System.out.println("before update, name = "+contact.getCellphone());
        StaffContact updated = new StaffContact.Builder().copy(contact).cellphone(newContact).build();
        System.out.println("After update(update), name = "+updated.getCellphone());
        this.service.update(updated);
        Assert.assertSame(newContact,updated.getCellphone());
    }

    @Test
    public void delete() {
        service.delete(contact.getCellphone());
        Assert.assertNotNull(contactSet);
    }
}