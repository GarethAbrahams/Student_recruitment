package com.garethabrahams.factory.Staff;

import com.garethabrahams.factory.Staff.StaffEmailFactory;
import com.garethabrahams.model.Staff.StaffEmail;
import org.junit.Assert;
import org.junit.Test;

public class StaffEmailFactoryTest {

    @Test
    public void createStaffEmail() {
        StaffEmail email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");
        Assert.assertEquals("gareth@gmail.com",email.getEmail());
    }
}