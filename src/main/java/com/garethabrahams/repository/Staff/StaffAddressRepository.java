package com.garethabrahams.repository.Staff;

import com.garethabrahams.model.Staff.StaffAddress;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface StaffAddressRepository extends IRepository<StaffAddress, String> {
    Set<StaffAddress> getAll();
}
