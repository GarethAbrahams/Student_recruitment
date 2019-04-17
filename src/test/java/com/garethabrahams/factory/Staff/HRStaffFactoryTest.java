package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.HRStaff;
import org.junit.Assert;
import org.junit.Test;

public class HRStaffFactoryTest {

    @Test
    public void createSDA() {
        HRStaff sda = HRStaffFactory.createSDA("Gareth","Abrahams","123456","gareth@reap","083123456","CPUT");
        Assert.assertNotNull(sda);
        Assert.assertEquals("Gareth",sda.getName());

    }
}