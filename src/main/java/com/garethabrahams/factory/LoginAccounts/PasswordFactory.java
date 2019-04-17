package com.garethabrahams.factory.LoginAccounts;

import com.garethabrahams.model.LoginAccounts.Password;

public class PasswordFactory {
    public static Password createPassword(String password){
        return new Password.Builder()
                .Password(password)
                .build();
    }
}
