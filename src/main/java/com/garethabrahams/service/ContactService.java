package com.garethabrahams.service;

import com.garethabrahams.model.Contact;

import java.util.Set;

public interface ContactService extends IService<Contact, String> {

    Set<Contact> getAll();
}
