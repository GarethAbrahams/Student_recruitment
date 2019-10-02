package com.garethabrahams.repository.bridge;

import com.garethabrahams.model.bridge.ApplicantAddress;
import com.garethabrahams.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ApplicantAddressRepository extends JpaRepository<ApplicantAddress,String> {

}
