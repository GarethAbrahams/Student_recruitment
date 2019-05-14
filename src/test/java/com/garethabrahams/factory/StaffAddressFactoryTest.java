package com.garethabrahams.factory;

import com.garethabrahams.factory.StaffAddressFactory;
import com.garethabrahams.factory.StaffCityFactory;
import com.garethabrahams.model.StaffAddress;
import com.garethabrahams.model.StaffCity;
import org.junit.Assert;
import org.junit.Test;

public class StaffAddressFactoryTest {

    @Test
    public void createStaffAddress() {
        StaffCity city = StaffCityFactory.createStaffCity("Cape town");
        StaffAddress address = StaffAddressFactory.createStaffAddress("18 2nd Ave","Fairways",city);
        Assert.assertEquals("Fairways",address.getSuburb());
    }
}