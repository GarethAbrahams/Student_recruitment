package com.garethabrahams.factory;

import com.garethabrahams.model.Username;
import com.garethabrahams.model.Staff;

public class UsernameFactory {
    public static Username createAccounts(String username, Staff user){
        return new Username.Builder()
                .username(username)
                .build();
    }
}
