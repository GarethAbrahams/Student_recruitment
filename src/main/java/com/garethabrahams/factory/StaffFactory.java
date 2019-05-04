package com.garethabrahams.factory;

import com.garethabrahams.model.*;

public class StaffFactory {
    public static Staff createStaff(String empID, String name, String surname, String id, StaffAddress address, StaffContact contact, StaffEmail email, Department dept, Roles role){
            return new Staff.Builder()
                .employeeID(empID)
                .name(name)
                .surname(surname)
                .id(id)
                .address(address)
                .contact(contact)
                .email(email)
                .department(dept)
                .role(role)
                .build();
    }
}
