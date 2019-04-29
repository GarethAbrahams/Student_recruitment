package com.garethabrahams.factory.LoginAccounts;

import com.garethabrahams.model.LoginAccounts.Username;
import com.garethabrahams.model.Staff.Staff;

public class UsernameFactory {
    public static Username createAccounts(String username, Staff user){
        return new Username.Builder()
                .username(username)
                .build();
    }
}
