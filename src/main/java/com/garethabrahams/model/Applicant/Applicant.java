package com.garethabrahams.model.Applicant;

public class Applicant {

    private String name, surname, id;

    private Applicant() {

    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }


    public Applicant(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.id = builder.id;

    }

    public static class Builder {
        private String name;
        private String surname;
        private String id;

        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Builder surname(String value) {
            this.surname = value;
            return this;
        }

        public Builder id(String value) {
            this.id = value;
            return this;
        }


        public Applicant build() {
            return new Applicant(this);
        }


    }
}

