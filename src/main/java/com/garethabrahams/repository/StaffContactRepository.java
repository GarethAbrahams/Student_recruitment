package com.garethabrahams.repository;

import com.garethabrahams.model.StaffContact;

import java.util.Set;

public interface StaffContactRepository extends IRepository<StaffContact, String> {
    Set<StaffContact> getAll();
}
