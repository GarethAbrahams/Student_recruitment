package com.garethabrahams.repository;

import com.garethabrahams.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface EmailRepository extends JpaRepository<Email, String> {
}
