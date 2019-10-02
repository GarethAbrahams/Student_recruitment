package com.garethabrahams.repository;

import com.garethabrahams.model.Contact;

import java.util.Set;

public interface ContactRepository extends IRepository <Contact,String> {
    Set<Contact> getAll();
}
