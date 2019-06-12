package com.garethabrahams.service.Staff;

import com.garethabrahams.model.Staff.StaffAddress;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface StaffAddressService extends IService<StaffAddress,String> {
    Set<StaffAddress> getAll();
}
