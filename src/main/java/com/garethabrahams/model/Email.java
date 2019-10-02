package com.garethabrahams.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Email {

    @Id
    private String emailID;
    private String email;

    public Email() {
    }

    public String getEmailID(){
        return emailID;
    }

    public String getEmail() {
        return email;
    }

    public Email(Email.Builder builder){
        this.emailID = builder.emailID;
        this.email = builder.email;
    }

    public static class Builder {

        private String emailID, email;

        public Email.Builder emailID(String value){
            this.emailID = value;
            return this;
        }

        public Email.Builder email(String value){
            this.email = value;
            return this;
        }

        public Email.Builder copy(Email email){
            this.emailID = email.emailID;
            this.email = email.email;
            return this;
        }

        public Email build(){
            return new Email(this);
        }
    }
}
