package com.garethabrahams.factory;

import com.garethabrahams.model.Contact;
import com.garethabrahams.util.IDGenerator;

public class ContactFactory {

    public static Contact createContact(String phone, String cellphone){
        String id = IDGenerator.generateID();

        return new Contact.Builder()
                .contactID(id)
                .phone(phone)
                .cellphone(cellphone)
                .build();
    }
}
