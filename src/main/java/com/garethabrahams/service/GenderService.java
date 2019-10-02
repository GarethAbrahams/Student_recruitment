package com.garethabrahams.service;

import com.garethabrahams.model.Gender;

import java.util.List;
import java.util.Set;

public interface GenderService extends IService<Gender, String> {

    Gender findByDesc(String genderDesc);
    List<Gender> getAll();
}
