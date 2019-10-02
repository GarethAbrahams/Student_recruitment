package com.garethabrahams.repository;
import com.garethabrahams.model.Outcome;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface OutcomeRepository extends JpaRepository<Outcome, String> {
}
