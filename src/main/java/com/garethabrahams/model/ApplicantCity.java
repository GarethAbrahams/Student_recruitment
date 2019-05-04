package com.garethabrahams.model;

public class ApplicantCity {

    String city;

    private ApplicantCity() {
    }

    public String getCity() {
        return city;
    }

    public ApplicantCity(Builder builder) {
        this.city = builder.city;

    }

    public static class Builder {
        private String city;

        public ApplicantCity.Builder city(String value) {
            this.city = value;
            return this;
        }

        public ApplicantCity.Builder copy(ApplicantCity NewCity){
            this.city = NewCity.city;
            return this;
        }

        public ApplicantCity build() {
            return new ApplicantCity(this);
        }


    }
}
