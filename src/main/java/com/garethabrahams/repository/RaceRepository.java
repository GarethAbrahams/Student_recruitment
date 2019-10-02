package com.garethabrahams.repository;
import com.garethabrahams.model.Race;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface RaceRepository extends JpaRepository<Race, String> {

}
