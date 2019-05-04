package com.garethabrahams.model;

public class ApplicantAddress {

    private String address;
    private String suburb;
    private ApplicantCity city;

    public ApplicantAddress() {
    }

    public String getAddress() {
        return address;
    }

    public String getSuburb(){ return suburb; }

    public String getCity(){
        return city.getCity();
    }

    public ApplicantAddress(Builder builder) {
        this.address = builder.address;
        this.suburb = builder.suburb;
        this.city = builder.city;

    }

    public static class Builder {
        private String address, suburb;
        private ApplicantCity city;

        public ApplicantAddress.Builder address(String value) {
            this.address = value;
            return this;
        }

        public ApplicantAddress.Builder suburb(String value){
            this.suburb = value;
            return this;
        }

        public ApplicantAddress.Builder city(ApplicantCity value){
            this.city = value;
            return this;
        }

        public ApplicantAddress.Builder copy(ApplicantAddress address){
            this.address = address.address;
            this.suburb = address.suburb;
            this.city = address.city;
            return this;
        }

        public ApplicantAddress build() {
            return new ApplicantAddress(this);
        }


    }
}
