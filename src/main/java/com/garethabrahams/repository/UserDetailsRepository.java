package com.garethabrahams.repository;
import com.garethabrahams.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface UserDetailsRepository extends JpaRepository<UserDetails, String> {

}
