package com.garethabrahams.service;

import com.garethabrahams.model.Email;

import java.util.Set;

public interface EmailService extends IService<Email, String> {

    Set<Email> getAll();
}
