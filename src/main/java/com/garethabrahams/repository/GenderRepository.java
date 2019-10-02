package com.garethabrahams.repository;
import com.garethabrahams.model.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface GenderRepository extends JpaRepository<Gender, String> {
}
