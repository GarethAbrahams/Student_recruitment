package com.garethabrahams.factory;

import com.garethabrahams.model.StaffEmail;

public class StaffEmailFactory {
    public static StaffEmail createStaffEmail(String email){
        return new StaffEmail.Builder()
                .email(email)
                .build();
    }
}
