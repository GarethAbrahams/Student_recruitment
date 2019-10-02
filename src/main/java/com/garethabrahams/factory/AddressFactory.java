package com.garethabrahams.factory;

import com.garethabrahams.model.Address;
import com.garethabrahams.util.IDGenerator;

public class AddressFactory {

    public static Address createAddress(String street, String suburb, String city){
        String id = IDGenerator.generateID();

        return new Address.Builder()
                .addressID(id)
                .streetAddress(street)
                .suburb(suburb)
                .city(city)
                .build();
    }
}
