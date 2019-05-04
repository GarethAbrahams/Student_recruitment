package com.garethabrahams.factory;

import com.garethabrahams.model.StaffContact;

public class StaffContactFactory {
    public static StaffContact createStaffContact(String phone, String cellphone){
        return new StaffContact.Builder()
                .phone(phone)
                .cellphone(cellphone)
                .build();
    }
}
