package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.Region;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegionFactoryTest {

    @Test
    public void createRegion() {

        Region city = RegionFactory.createRegion("CPT");
        Assert.assertEquals("CPT",city.getRegion());

    }
}