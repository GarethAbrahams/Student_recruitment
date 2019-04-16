package com.garethabrahams.model.Student;

public class StudentCity {

    String city;

    private StudentCity() {
    }

    public String getCity() {
        return city;
    }

    public StudentCity (Builder builder) {
        this.city = builder.city;

    }

    public static class Builder {
        private String city;

        public StudentCity.Builder city(String value) {
            this.city = value;
            return this;
        }

        public StudentCity build() {
            return new StudentCity(this);
        }


    }
}
