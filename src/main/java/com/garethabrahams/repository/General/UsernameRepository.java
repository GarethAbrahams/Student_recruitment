package com.garethabrahams.repository.General;

import com.garethabrahams.model.General.Username;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface UsernameRepository extends IRepository<Username, String> {
    Set<Username> getAll();
}
