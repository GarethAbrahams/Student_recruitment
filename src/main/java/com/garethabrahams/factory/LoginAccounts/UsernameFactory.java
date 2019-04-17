package com.garethabrahams.factory.LoginAccounts;

import com.garethabrahams.model.LoginAccounts.Username;

public class UsernameFactory {
    public static Username createAccounts(String username){
        return new Username.Builder()
                .username(username)
                .build();
    }
}
