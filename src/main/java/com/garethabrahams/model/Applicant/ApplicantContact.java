package com.garethabrahams.model.Applicant;

public class ApplicantContact {
    private String phone, cellphone;

    private ApplicantContact() {

    }

    public String getPhone() {
        return phone;
    }

    public String getCellphone() {
        return cellphone;
    }


    public ApplicantContact(Builder builder) {
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


        public ApplicantContact build() {
            return new ApplicantContact(this);
        }


    }
}
