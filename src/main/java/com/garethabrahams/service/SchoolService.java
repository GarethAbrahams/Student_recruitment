package com.garethabrahams.service;

import com.garethabrahams.model.School;

import java.util.Set;

public interface SchoolService extends IService<School, String> {

    Set<School> getAll();
}
