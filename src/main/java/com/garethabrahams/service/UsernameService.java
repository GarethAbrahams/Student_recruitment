package com.garethabrahams.service;

import com.garethabrahams.model.Username;

import java.util.Set;

public interface UsernameService extends IService<Username,String> {
    Set<Username> getAll();
}
