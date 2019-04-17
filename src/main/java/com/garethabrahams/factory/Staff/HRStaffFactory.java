package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.HRStaff;

public class HRStaffFactory {

    public static HRStaff createSDA(String name, String surname, String empID, String email, String cellphone, String campus) {
        return new HRStaff.Builder()
                .name(name)
                .surname(surname)
                .empID(empID)
                .email(email)
                .cellphone(cellphone)
                .campus(campus)
                .build();
    }
}
