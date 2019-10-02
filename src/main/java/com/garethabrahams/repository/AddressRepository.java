package com.garethabrahams.repository;

import com.garethabrahams.model.Address;
import java.util.Set;

public interface AddressRepository extends IRepository <Address,String> {
    Set<Address> getAll();
}
