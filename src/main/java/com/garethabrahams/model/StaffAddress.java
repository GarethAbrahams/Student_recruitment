package com.garethabrahams.model;

public class StaffAddress {

    private String address;
    private String suburb;
    private StaffCity city;

    public StaffAddress() {
    }

    public String getAddress() {
        return address;
    }

    public String getSuburb(){ return suburb; }

    public String getCity(){
        return city.getCity();
    }

    public StaffAddress(Builder builder) {
        this.address = builder.address;
        this.suburb = builder.suburb;
        this.city = builder.city;

    }

    public static class Builder {
        private String address, suburb;
        private StaffCity city;

        public StaffAddress.Builder address(String value) {
            this.address = value;
            return this;
        }

        public StaffAddress.Builder suburb(String value){
            this.suburb = value;
            return this;
        }

        public StaffAddress.Builder city(StaffCity value){
            this.city = value;
            return this;
        }

        public StaffAddress.Builder copy(StaffAddress address){
            this.address = address.address;
            this.suburb = address.suburb;
            this.city = address.city;
            return this;
        }

        public StaffAddress build() {
            return new StaffAddress(this);
        }


    }
}
