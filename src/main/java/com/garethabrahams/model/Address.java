package com.garethabrahams.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

    @Id
    private String addressID;
    private String streetAddress;
    private String suburb;
    private String city;

    public Address() {
    }

    public String getAddressID(){ return addressID; }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getSuburb(){ return suburb; }

    public String getCity(){
        return city;
    }

    public Address(Builder builder) {
        this.addressID = builder.addressID;
        this.streetAddress = builder.streetAddress;
        this.suburb = builder.suburb;
        this.city = builder.city;

    }

    public static class Builder {
        private String addressID, streetAddress, suburb, city;

        public Address.Builder addressID(String value){
            this.addressID = value;
            return this;
        }

        public Address.Builder streetAddress(String value) {
            this.streetAddress = value;
            return this;
        }

        public Address.Builder suburb(String value){
            this.suburb = value;
            return this;
        }

        public Address.Builder city(String value){
            this.city = value;
            return this;
        }

        public Address.Builder copy(Address address){
            this.addressID = address.addressID;
            this.streetAddress = address.streetAddress;
            this.suburb = address.suburb;
            this.city = address.city;
            return this;
        }

        public Address build() {
            return new Address(this);
        }


    }
}
