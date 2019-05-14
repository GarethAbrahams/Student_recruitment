package com.garethabrahams.service;

import com.garethabrahams.model.Password;

import java.util.Set;

public interface PasswordService extends IService<Password,String> {
    Set<Password> getAll();
}
