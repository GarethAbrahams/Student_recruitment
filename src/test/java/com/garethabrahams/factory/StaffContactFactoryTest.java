package com.garethabrahams.factory;

import com.garethabrahams.factory.StaffContactFactory;
import com.garethabrahams.model.StaffContact;
import org.junit.Assert;
import org.junit.Test;

public class StaffContactFactoryTest {

    @Test
    public void createStaffContact() {
        StaffContact contact = StaffContactFactory.createStaffContact("0211234568","0824567895");
        Assert.assertEquals("0211234568",contact.getPhone());
    }
}