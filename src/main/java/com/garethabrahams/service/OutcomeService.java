package com.garethabrahams.service;

import com.garethabrahams.model.Outcome;

import java.util.List;
import java.util.Set;

public interface OutcomeService extends IService<Outcome, String> {

    Outcome findByItem(String itemdesc);

    List<Outcome> getAll();
}
