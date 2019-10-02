package com.garethabrahams.service;

import com.garethabrahams.model.School;

import java.util.List;
import java.util.Set;

public interface SchoolService extends IService<School, String> {
    School findByItem(String itemdesc);

    List<School> getAll();
}
