package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.SupportStaff;

public class SupportStaffFactory {

    public static SupportStaff createSDA(String name, String surname, String empID, String email, String cellphone, String campus) {
        return new SupportStaff.Builder()
                .name(name)
                .surname(surname)
                .empID(empID)
                .email(email)
                .cellphone(cellphone)
                .campus(campus)
                .build();
    }
}
