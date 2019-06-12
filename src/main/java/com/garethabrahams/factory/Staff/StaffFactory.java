package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.General.Department;
import com.garethabrahams.model.General.Roles;
import com.garethabrahams.model.Staff.Staff;
import com.garethabrahams.model.Staff.StaffAddress;
import com.garethabrahams.model.Staff.StaffContact;
import com.garethabrahams.model.Staff.StaffEmail;

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
