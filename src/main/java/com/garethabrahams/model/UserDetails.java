package com.garethabrahams.model;

public class UserDetails {

    private String username, password;


    public UserDetails() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword(){
        return password;
    }


    public UserDetails(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
    }

    public static class Builder {
        private String username;
        private String password;

        public UserDetails.Builder username(String value) {
            this.username = value;
            return this;
        }

        public UserDetails.Builder password(String value){
            this.password = value;
            return this;
        }

        public UserDetails.Builder copy(UserDetails user){
            this.username = user.username;
            this.password = user.password;
            return this;
        }

        public UserDetails build() {
            return new UserDetails(this);
        }
    }

}
