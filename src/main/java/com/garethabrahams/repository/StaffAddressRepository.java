package com.garethabrahams.repository;

import com.garethabrahams.model.Staff.StaffAddress;

import java.util.Set;

public interface StaffAddressRepository extends IRepository<StaffAddress, String> {
    Set<StaffAddress> getAll();
}
