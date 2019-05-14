package com.garethabrahams.service;

import com.garethabrahams.model.StaffEmail;

import java.util.Set;

public interface StaffEmailService extends IService<StaffEmail,String> {
    Set<StaffEmail> getAll();
}
