package com.garethabrahams.service.General;

import com.garethabrahams.model.General.Password;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface PasswordService extends IService<Password,String> {
    Set<Password> getAll();
}
