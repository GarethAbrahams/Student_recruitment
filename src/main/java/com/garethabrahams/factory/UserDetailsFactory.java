package com.garethabrahams.factory;

import com.garethabrahams.model.UserDetails;

public class UserDetailsFactory {

    public static UserDetails createUserDetails(String username, String password){
        return new UserDetails.Builder()
                .username(username)
                .password(password)
                .build();
    }
}
