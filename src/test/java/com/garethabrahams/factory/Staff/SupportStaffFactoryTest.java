package com.garethabrahams.factory.Staff;

import com.garethabrahams.factory.Staff.SupportStaffFactory;
import com.garethabrahams.model.Staff.SupportStaff;
import org.junit.Assert;
import org.junit.Test;

public class SupportStaffFactoryTest {

    @Test
    public void createSDA() {
        SupportStaff sda = SupportStaffFactory.createSDA("Gareth","Abrahams","123456","gareth@reap","083123456","CPUT");
        Assert.assertNotNull(sda);
        Assert.assertEquals("Gareth",sda.getName());

    }
}