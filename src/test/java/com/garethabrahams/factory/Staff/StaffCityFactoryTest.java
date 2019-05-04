package com.garethabrahams.factory.Staff;

import com.garethabrahams.factory.StaffCityFactory;
import com.garethabrahams.model.StaffCity;
import org.junit.Assert;
import org.junit.Test;

public class StaffCityFactoryTest {

    @Test
    public void createStaffCity() {
        StaffCity city = StaffCityFactory.createStaffCity("Cape town");
        Assert.assertEquals("Cape town",city.getCity());
    }
}