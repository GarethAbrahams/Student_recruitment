package com.garethabrahams.model.Staff;

public class StaffCity {
    String city;

    private StaffCity() {
    }

    public String getCity() {
        return city;
    }

    public StaffCity(Builder builder) {
        this.city = builder.city;

    }

    public static class Builder {
        private String city;

        public StaffCity.Builder city(String value) {
            this.city = value;
            return this;
        }

        public StaffCity build() {
            return new StaffCity(this);
        }


    }
}
