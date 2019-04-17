package com.garethabrahams.model.Applicant;

public class ApplicatantAddress {

    private String address;

    public ApplicatantAddress() {
    }

    public String getAddress() {
        return address;
    }

    public ApplicatantAddress(Builder builder) {
        this.address = builder.address;

    }

    public static class Builder {
        private String address;

        public ApplicatantAddress.Builder address(String value) {
            this.address = value;
            return this;
        }

        public ApplicatantAddress build() {
            return new ApplicatantAddress(this);
        }


    }
}
