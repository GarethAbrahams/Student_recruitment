package com.garethabrahams.factory.LoginAccounts;

import com.garethabrahams.model.LoginAccounts.Accounts;

public class AccountsFactory {
    public static Accounts createAccounts(String username, String password){
        return new Accounts.Builder()
                .username(username)
                .password(password)
                .build();
    }
}
