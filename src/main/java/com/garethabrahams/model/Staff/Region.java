package com.garethabrahams.model.Staff;

public class Region {

    String city;

    private Region(){
    }

    public String getRegion(){
        return city;
    }
    public Region (Builder builder) {
        this.city = builder.city;

    }

    public static class Builder {
        private String city;

        public Region.Builder city(String value) {
            this.city = value;
            return this;
        }

        public Region build() {
            return new Region(this);
        }
    }
}
