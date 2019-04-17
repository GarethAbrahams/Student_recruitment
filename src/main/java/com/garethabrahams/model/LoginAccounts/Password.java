package com.garethabrahams.model.LoginAccounts;

public class Password {

    String password;

    private Password(){
    }

    public String getPassword(){
        return password;
    }

    public Password(Builder builder) {
        this.password = builder.password;
    }

    public static class Builder {
        private String password;

        public Password.Builder Password(String value) {
            this.password = value;
            return this;
        }

        public Password build() {
            return new Password(this);
        }
    }
}
