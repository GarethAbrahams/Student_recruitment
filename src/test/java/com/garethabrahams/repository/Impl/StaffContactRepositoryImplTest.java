package com.garethabrahams.repository.Impl;

import com.garethabrahams.factory.Staff.StaffContactFactory;
import com.garethabrahams.model.Staff.StaffContact;
import com.garethabrahams.repository.StaffContactRepository;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class StaffContactRepositoryImplTest {
    private static StaffContactRepository staffContactRepository;
    private static StaffContact contact;
    private static Set<StaffContact> contactSet = new HashSet<>();

    @Test
    public void create() {

        staffContactRepository = StaffContactRepositoryImpl.getRepository();
        contact = StaffContactFactory.createStaffContact("0211234568","0824567895");

        contactSet.add(staffContactRepository.create(contact));

        Assert.assertEquals(contact.getCellphone(),staffContactRepository.read(contact.getCellphone()).getCellphone());
    }

    @Test
    public void update() {
        create();
        StaffContact con = staffContactRepository.update(contact);
        Assert.assertEquals(con.getCellphone(),contact.getCellphone());
    }

    @Test
    public void delete() {
        create();
        StaffContact con = staffContactRepository.read(contact.getCellphone());
        staffContactRepository.delete(con.getCellphone());
        Assert.assertEquals(con,staffContactRepository.read(contact.getCellphone()));
    }

    @Test
    public void read() {
        create();
        Assert.assertEquals(contact.getCellphone(),staffContactRepository.read("0824567895").getCellphone());
    }
}