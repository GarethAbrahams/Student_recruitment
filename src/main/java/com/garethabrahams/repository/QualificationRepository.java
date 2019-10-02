package com.garethabrahams.repository;
import com.garethabrahams.model.Qualification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface QualificationRepository extends JpaRepository<Qualification, String> {

}
