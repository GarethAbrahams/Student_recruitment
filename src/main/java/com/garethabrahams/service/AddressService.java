package com.garethabrahams.service;

import com.garethabrahams.model.Address;

import java.util.List;
import java.util.Set;

public interface AddressService extends IService<Address, String> {
    Address findByItem(String itemdesc);
    List<Address> getAll();
}
