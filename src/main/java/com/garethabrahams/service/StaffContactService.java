package com.garethabrahams.service;

import com.garethabrahams.model.StaffContact;

import java.util.Set;

public interface StaffContactService extends IService<StaffContact,String> {
    Set<StaffContact> getAll();
}
