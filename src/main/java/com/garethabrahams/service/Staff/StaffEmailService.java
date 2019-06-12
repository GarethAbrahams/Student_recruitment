package com.garethabrahams.service.Staff;

import com.garethabrahams.model.Staff.StaffEmail;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface StaffEmailService extends IService<StaffEmail,String> {
    Set<StaffEmail> getAll();
}
