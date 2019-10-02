package com.garethabrahams.repository;

import com.garethabrahams.model.Email;

import java.util.Set;

public interface EmailRepository extends IRepository <Email, String> {
    Set<Email> getAll();
}
