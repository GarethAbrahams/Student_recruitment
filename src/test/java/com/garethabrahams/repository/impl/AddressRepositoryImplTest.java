package com.garethabrahams.repository.impl;

import com.garethabrahams.factory.AddressFactory;
import com.garethabrahams.model.Address;
import com.garethabrahams.repository.AddressRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Set;

import static org.junit.Assert.*;

public class AddressRepositoryImplTest {

    private static AddressRepository repository;
    private static Address address;
    private String id;

    @Before
    @Test
    public void create() {
        repository = AddressRepositoryImpl.getRepository();

        address = AddressFactory.createAddress("200 main rd","Newlands","Cape Town");
        id = address.getAddressID();
        Address result = repository.create(address);
        Assert.assertEquals(id,result.getAddressID());

    }

    @Test
    public void getAll() {
        Set<Address> result = repository.getAll();
        Assert.assertNotNull(result);
    }

    @Test
    public void update() {
        Address result = repository.read(id);
        String newAdd = "240 main rd";
        Address newAddress = new Address.Builder().copy(result).streetAddress(newAdd).build();
        Address newRead = repository.update(newAddress);

        Assert.assertEquals(id,newRead.getAddressID());
        Assert.assertEquals(newAdd,newAddress.getStreetAddress());

    }

    @Test
    public void delete() {
        Address result = repository.read(id);
        repository.delete(id);
        Address newResult = repository.read(id);
        Assert.assertNull(newResult);
    }

    @Test
    public void read() {
        Address address = repository.read(id);
        Assert.assertEquals(id,address.getAddressID());
    }
}