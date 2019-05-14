package com.garethabrahams.factory;

import com.garethabrahams.factory.StaffEmailFactory;
import com.garethabrahams.model.StaffEmail;
import org.junit.Assert;
import org.junit.Test;

public class StaffEmailFactoryTest {

    @Test
    public void createStaffEmail() {
        StaffEmail email = StaffEmailFactory.createStaffEmail("gareth@gmail.com");
        Assert.assertEquals("gareth@gmail.com",email.getEmail());
    }
}