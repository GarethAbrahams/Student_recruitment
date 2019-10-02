package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantOutcome;
import com.garethabrahams.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ApplicantOutcomeRepository extends JpaRepository<ApplicantOutcome,String> {

}
