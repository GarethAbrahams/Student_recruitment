package com.garethabrahams.model.LoginAccounts;

public class Username {
    String username;

    public Username() {
    }

    public String getUsername() {
        return username;
    }


    public Username(Builder builder) {
        this.username = builder.username;
    }

    public static class Builder {
        private String username;

        public Username.Builder username(String value) {
            this.username = value;
            return this;
        }

        public Username build() {
            return new Username(this);
        }
    }
}

