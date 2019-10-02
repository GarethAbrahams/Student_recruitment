package com.garethabrahams.repository;
import com.garethabrahams.model.WorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface WorkExperienceRepository extends JpaRepository<WorkExperience, String> {

}
