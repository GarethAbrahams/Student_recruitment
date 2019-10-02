package com.garethabrahams.repository;
import com.garethabrahams.model.Gender;

import java.util.Set;

public interface GenderRepository extends IRepository <Gender, String> {
    Set<Gender> getAll();
}
