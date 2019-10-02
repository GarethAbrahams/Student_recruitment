package com.garethabrahams.service;

import com.garethabrahams.model.Outcome;

import java.util.Set;

public interface OutcomeService extends IService<Outcome, String> {

    Set<Outcome> getAll();
}
