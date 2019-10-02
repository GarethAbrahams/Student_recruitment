package com.garethabrahams.service;

import com.garethabrahams.model.Race;

import java.util.Set;

public interface RaceService extends IService<Race, String> {

    Set<Race> getAll();
}
