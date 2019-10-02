package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantGender;
import com.garethabrahams.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ApplicantGenderRepository extends JpaRepository<ApplicantGender,String> {

}
