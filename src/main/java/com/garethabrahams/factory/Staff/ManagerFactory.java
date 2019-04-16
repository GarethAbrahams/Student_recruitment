package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.Manager;

public class ManagerFactory {
    public static Manager createManager(String name, String surname, String empID, String department) {
        return new Manager.Builder()
                .name(name)
                .surname(surname)
                .empID(empID)
                .department(department)
                .build();
    }
}
