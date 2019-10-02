package com.garethabrahams.service;

import com.garethabrahams.model.UserDetails;

import java.util.Set;

public interface UserDetailsService extends IService<UserDetails, String> {

    Set<UserDetails> getAll();
}
