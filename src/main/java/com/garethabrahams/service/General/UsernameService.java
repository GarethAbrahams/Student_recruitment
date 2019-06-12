package com.garethabrahams.service.General;

import com.garethabrahams.model.General.Username;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface UsernameService extends IService<Username,String> {
    Set<Username> getAll();
}
