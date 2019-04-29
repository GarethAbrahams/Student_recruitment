package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.StaffContact;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaffContactFactoryTest {

    @Test
    public void createStaffContact() {
        StaffContact contact = StaffContactFactory.createStaffContact("0211234568","0824567895");
        Assert.assertEquals("0211234568",contact.getPhone());
    }
}