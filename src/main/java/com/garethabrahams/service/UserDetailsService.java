package com.garethabrahams.service;

import com.garethabrahams.model.UserDetails;

import java.util.List;
import java.util.Set;

public interface UserDetailsService extends IService<UserDetails, String> {

    UserDetails findByItem(String itemdesc);

    List<UserDetails> getAll();
}
