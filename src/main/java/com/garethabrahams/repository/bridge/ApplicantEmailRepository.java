package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantContact;
import com.garethabrahams.model.bridge.ApplicantEmail;
import com.garethabrahams.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ApplicantEmailRepository extends JpaRepository<ApplicantEmail,String> {

}
