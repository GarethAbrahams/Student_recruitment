package com.garethabrahams.factory.Staff;

import com.garethabrahams.factory.Staff.StaffAddressFactory;
import com.garethabrahams.factory.Staff.StaffCityFactory;
import com.garethabrahams.model.Staff.StaffAddress;
import com.garethabrahams.model.Staff.StaffCity;
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