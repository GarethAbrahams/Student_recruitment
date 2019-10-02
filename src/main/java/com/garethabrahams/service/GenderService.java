package com.garethabrahams.service;

import com.garethabrahams.model.Gender;

import java.util.Set;

public interface GenderService extends IService<Gender, String> {

    Set<Gender> getAll();
}
