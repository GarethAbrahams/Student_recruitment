package com.garethabrahams.repository;
import com.garethabrahams.model.School;

import java.util.Set;

public interface SchoolRepository extends IRepository <School, String> {
    Set<School> getAll();
}
