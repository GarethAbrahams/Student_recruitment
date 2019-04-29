package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.StaffContact;

public class StaffContactFactory {
    public static StaffContact createStaffContact(String phone, String cellphone){
        return new StaffContact.Builder()
                .phone(phone)
                .cellphone(cellphone)
                .build();
    }
}
