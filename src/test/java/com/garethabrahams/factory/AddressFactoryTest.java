package com.garethabrahams.factory;

import com.garethabrahams.model.Address;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddressFactoryTest {

    @Test
    public void createAddress() {

        Address address = AddressFactory.createAddress("100 Main Rd", "Newlands","Cape Town");
        String id = address.getAddressID();
        Assert.assertEquals(id,address.getAddressID());
    }
}