package com.garethabrahams.model.LoginAccounts;

public class Accounts {
    String username, password;

    public Accounts() {
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Accounts (Builder builder) {
        this.username = builder.username;
        this.password = builder.password;

    }

    public static class Builder {
        private String username, password;

        public Accounts.Builder username(String value) {
            this.username = value;
            return this;
        }

        public Accounts.Builder password(String value) {
            this.password = value;
            return this;
        }

        public Accounts build() {
            return new Accounts(this);
        }
    }
}

