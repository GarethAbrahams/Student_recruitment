package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.StaffCity;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StaffCityFactoryTest {

    @Test
    public void createStaffCity() {
        StaffCity city = StaffCityFactory.createStaffCity("Cape town");
        Assert.assertEquals("Cape town",city.getCity());
    }
}