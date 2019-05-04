package com.garethabrahams.factory;

import com.garethabrahams.model.Password;

public class PasswordFactory {
    public static Password createPassword(String password){
        return new Password.Builder()
                .Password(password)
                .build();
    }
}
