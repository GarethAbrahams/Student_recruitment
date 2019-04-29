package com.garethabrahams.repository;

import com.garethabrahams.model.LoginAccounts.Password;

import java.util.Set;

public interface PasswordRepository extends IRepository<Password, String>{
    Set<Password> getAll();
}