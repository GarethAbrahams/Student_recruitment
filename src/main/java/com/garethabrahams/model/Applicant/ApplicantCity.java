package com.garethabrahams.model.Applicant;

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

        public ApplicantCity build() {
            return new ApplicantCity(this);
        }


    }
}
