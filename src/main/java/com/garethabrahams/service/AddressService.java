package com.garethabrahams.service;

import com.garethabrahams.model.Address;

import java.util.Set;

public interface AddressService extends IService<Address, String> {

    Set<Address> getAll();
}
