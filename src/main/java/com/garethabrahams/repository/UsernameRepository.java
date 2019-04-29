package com.garethabrahams.repository;

import com.garethabrahams.model.LoginAccounts.Username;

import java.util.Set;

public interface UsernameRepository extends IRepository<Username, String>{
    Set<Username> getAll();
}
