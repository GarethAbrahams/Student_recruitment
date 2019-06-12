package com.garethabrahams.factory.General;

import com.garethabrahams.model.General.Username;
import com.garethabrahams.model.Staff.Staff;

public class UsernameFactory {
    public static Username createAccounts(String username, Staff user){
        return new Username.Builder()
                .username(username)
                .build();
    }
}
