package com.garethabrahams.factory;

import com.garethabrahams.model.Email;
import com.garethabrahams.util.IDGenerator;

public class EmailFactory {

    public static Email createEmail(String email){
        String id = IDGenerator.generateID();

        return new Email.Builder()
                .emailID(id)
                .email(email)
                .build();
    }
}
