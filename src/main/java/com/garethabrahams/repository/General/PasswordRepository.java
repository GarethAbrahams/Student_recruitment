package com.garethabrahams.repository.General;

import com.garethabrahams.model.General.Password;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface PasswordRepository extends IRepository<Password, String> {
    Set<Password> getAll();
}
