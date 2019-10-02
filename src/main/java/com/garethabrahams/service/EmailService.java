package com.garethabrahams.service;

import com.garethabrahams.model.Email;

import java.util.List;
import java.util.Set;

public interface EmailService extends IService<Email, String> {
    Email findByItem(String itemdesc);
    List<Email> getAll();
}
