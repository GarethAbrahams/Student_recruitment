package com.garethabrahams.repository;

import com.garethabrahams.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface ContactRepository extends JpaRepository<Contact,String> {
}
