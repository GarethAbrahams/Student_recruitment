package com.garethabrahams.repository.Staff;

import com.garethabrahams.model.Staff.StaffContact;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface StaffContactRepository extends IRepository<StaffContact, String> {
    Set<StaffContact> getAll();
}
