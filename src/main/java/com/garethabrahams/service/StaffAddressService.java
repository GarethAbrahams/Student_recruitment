package com.garethabrahams.service;

import com.garethabrahams.model.StaffAddress;

import java.util.Set;

public interface StaffAddressService extends IService<StaffAddress,String> {
    Set<StaffAddress> getAll();
}
