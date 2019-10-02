package com.garethabrahams.repository;
import com.garethabrahams.model.Outcome;

import java.util.Set;

public interface OutcomeRepository extends IRepository <Outcome, String> {
    Set<Outcome> getAll();
}
