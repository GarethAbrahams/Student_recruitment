package com.garethabrahams.factory;

import com.garethabrahams.model.SupportStaff;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SupportStaffFactoryTest {

    @Test
    public void createSDA() {
        SupportStaff sda = SupportStaffFactory.createSDA("Gareth","Abrahams","123456","gareth@reap","083123456","CPUT");
        Assert.assertNotNull(sda);
        Assert.assertEquals("Gareth",sda.getName());

    }
}