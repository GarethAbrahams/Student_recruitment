package com.garethabrahams.repository;
import com.garethabrahams.model.Race;

import java.util.Set;

public interface RaceRepository extends IRepository <Race, String> {
    Set<Race> getAll();
}
