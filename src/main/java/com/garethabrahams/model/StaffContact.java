package com.garethabrahams.model;

public class StaffContact {

    private String phone, cellphone;

    private StaffContact() {

    }

    public String getPhone() {
        return phone;
    }

    public String getCellphone() {
        return cellphone;
    }


    public StaffContact(Builder builder) {
        this.phone = builder.phone;
        this.cellphone = builder.cellphone;

    }

    public static class Builder {
        private String phone;
        private String cellphone;

        public Builder phone(String value) {
            this.phone = value;
            return this;
        }

        public Builder cellphone(String value) {
            this.cellphone = value;
            return this;
        }

        public Builder copy(StaffContact contact){
            this.phone = contact.phone;
            this.cellphone = contact.cellphone;
            return this;
        }


        public StaffContact build() {
            return new StaffContact(this);
        }


    }
}
