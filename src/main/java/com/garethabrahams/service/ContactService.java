package com.garethabrahams.service;

import com.garethabrahams.model.Contact;

import java.util.List;
import java.util.Set;

public interface ContactService extends IService<Contact, String> {
    Contact findByItem(String itemdesc);
    List<Contact> getAll();
}
