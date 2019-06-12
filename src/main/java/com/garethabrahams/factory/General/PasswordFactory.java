package com.garethabrahams.factory.General;

import com.garethabrahams.model.General.Password;

public class PasswordFactory {
    public static Password createPassword(String password){
        return new Password.Builder()
                .Password(password)
                .build();
    }
}
