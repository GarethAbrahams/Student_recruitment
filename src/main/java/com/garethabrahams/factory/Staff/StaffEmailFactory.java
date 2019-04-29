package com.garethabrahams.factory.Staff;

import com.garethabrahams.model.Staff.StaffEmail;

public class StaffEmailFactory {
    public static StaffEmail createStaffEmail(String email){
        return new StaffEmail.Builder()
                .email(email)
                .build();
    }
}
