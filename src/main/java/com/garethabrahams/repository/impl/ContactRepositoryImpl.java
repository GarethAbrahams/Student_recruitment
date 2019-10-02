package com.garethabrahams.repository.impl;

import com.garethabrahams.model.Applicant;
import com.garethabrahams.model.Contact;
import com.garethabrahams.repository.ApplicantRepository;
import com.garethabrahams.repository.ContactRepository;

import java.util.HashSet;
import java.util.Set;

public class ContactRepositoryImpl implements ContactRepository {

    private static ContactRepositoryImpl repository = null;
    private Set<Contact> contactSet;

    private ContactRepositoryImpl(){
        this.contactSet = new HashSet<>();
    }

    public static ContactRepositoryImpl getRepository(){
        if (repository==null)
            repository = new ContactRepositoryImpl();

        return repository;
    }

    @Override
    public Set<Contact> getAll() {
        return this.contactSet;
    }

    @Override
    public Contact create(Contact e) {
        this.contactSet.add(e);
        return e;
    }

    @Override
    public Contact update(Contact e) {
        Contact oldResult = read(e.getContactID());
        if(oldResult != null) {
            delete(oldResult.getContactID());
            create(e);
            return e;
        }
        return null;
    }

    @Override
    public void delete(String e) {
        Contact result = read(e);
        this.contactSet.remove(result);
    }

    @Override
    public Contact read(String e) {
        for (Contact contact : this.contactSet){
            if (contact.getContactID().equals(e))
                return contact;
        }
        return null;
    }
}
