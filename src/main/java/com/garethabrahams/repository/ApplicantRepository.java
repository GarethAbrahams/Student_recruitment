package com.garethabrahams.repository;

import com.garethabrahams.model.Address;
import com.garethabrahams.model.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ApplicantRepository extends JpaRepository<Applicant,String> {
}
