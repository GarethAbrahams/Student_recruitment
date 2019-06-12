package com.garethabrahams.service.Staff;

import com.garethabrahams.model.Staff.StaffContact;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface StaffContactService extends IService<StaffContact,String> {
    Set<StaffContact> getAll();
}
