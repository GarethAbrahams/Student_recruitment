package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.Administrator;

public class AdministratorFactory {
    public static Administrator createAdministrator(String name, String surname, String empID) {
        return new Administrator.Builder()
                .name(name)
                .surname(surname)
                .empID(empID)
                .build();
    }
}
