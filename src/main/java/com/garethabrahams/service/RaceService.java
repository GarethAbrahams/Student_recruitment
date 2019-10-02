package com.garethabrahams.service;

import com.garethabrahams.model.Race;

import java.util.List;
import java.util.Set;

public interface RaceService extends IService<Race, String> {

    Race findByItem(String itemdesc);

    List<Race> getAll();
}
