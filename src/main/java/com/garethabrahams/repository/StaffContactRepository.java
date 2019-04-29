package com.garethabrahams.repository;

import com.garethabrahams.model.Staff.StaffContact;

import java.util.Set;

public interface StaffContactRepository extends IRepository<StaffContact, String> {
    Set<StaffContact> getAll();
}
