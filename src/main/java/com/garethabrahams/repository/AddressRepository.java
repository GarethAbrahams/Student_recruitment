package com.garethabrahams.repository;

import com.garethabrahams.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface AddressRepository extends JpaRepository<Address,String> {
}
