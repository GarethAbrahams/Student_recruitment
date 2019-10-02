package com.garethabrahams.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {

        @Id
        private String contactID;
        private String phone, cellphone;

        private Contact() {

        }

        public String getContactID(){
           return contactID;
        }

        public String getPhone() {
            return phone;
        }

        public String getCellphone() {
            return cellphone;
        }


        public Contact(Builder builder) {
            this.contactID = builder.contactID;
            this.phone = builder.phone;
            this.cellphone = builder.cellphone;

        }

        public static class Builder {
            private String contactID;
            private String phone;
            private String cellphone;

            public Builder contactID(String value){
                this.contactID = value;
                return this;
            }

            public Builder phone(String value) {
                this.phone = value;
                return this;
            }

            public Builder cellphone(String value) {
                this.cellphone = value;
                return this;
            }

            public Builder copy(Contact contact){
                this.contactID = contact.contactID;
                this.cellphone = contact.cellphone;
                this.phone = contact.phone;
                return this;
            }

            public Contact build() {
                return new Contact(this);
            }
        }
}
