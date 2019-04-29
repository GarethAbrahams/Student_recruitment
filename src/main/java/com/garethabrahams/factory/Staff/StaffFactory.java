package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.*;

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
