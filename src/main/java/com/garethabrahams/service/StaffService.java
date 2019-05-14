package com.garethabrahams.service;

import com.garethabrahams.model.Staff;

import java.util.Set;

public interface StaffService extends IService<Staff, String> {
    Set<Staff> getAll();
}
