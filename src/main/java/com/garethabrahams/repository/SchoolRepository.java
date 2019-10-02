package com.garethabrahams.repository;
import com.garethabrahams.model.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface SchoolRepository extends JpaRepository<School, String> {

}
