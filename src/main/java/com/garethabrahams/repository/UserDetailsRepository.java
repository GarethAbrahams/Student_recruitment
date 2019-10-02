package com.garethabrahams.repository;
import com.garethabrahams.model.UserDetails;

import java.util.Set;

public interface UserDetailsRepository extends IRepository <UserDetails, String> {
    Set<UserDetails> getAll();
}
