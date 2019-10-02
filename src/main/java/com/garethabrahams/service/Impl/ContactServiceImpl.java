package com.garethabrahams.service.Impl;

import com.garethabrahams.model.Address;
import com.garethabrahams.model.Contact;
import com.garethabrahams.repository.AddressRepository;
import com.garethabrahams.repository.ContactRepository;
import com.garethabrahams.service.AddressService;
import com.garethabrahams.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("ContactService")
public class ContactServiceImpl implements ContactService {

    private static ContactService service = null;

    @Autowired
    private ContactRepository repository;

    public static ContactService getService(){
        if (service == null)
            service = new ContactServiceImpl();
        return service;
    }

    @Override
    public Contact create(Contact e) {
        return this.repository.save(e);
    }

    @Override
    public Contact read(String s) {
        Optional<Contact> result = this.repository.findById(s);
        return result.orElse(null);
    }

    @Override
    public Contact update(Contact e) {
        return this.repository.save(e);
    }

    @Override
    public void delete(String s) {
        this.repository.deleteById(s);
    }

    @Override
    public Contact findByItem(String itemdesc) {
        List<Contact> contacts = getAll();
        for (Contact contact : contacts) {
            if (contact.getCellphone().equalsIgnoreCase(itemdesc)) return contact;
        }
        return null;
    }

    @Override
    public List<Contact> getAll() {
        return this.repository.findAll();
    }

}
