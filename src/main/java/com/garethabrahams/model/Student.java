package com.garethabrahams.model;

import javafx.util.Builder;

public class Student {

    private String name, surname, id, email, cellphone, address, school;
    private double familyIncome;

    private Student() {

    }

    public String getAddress() {
        return address;
    }

    public String getSchool() {
        return school;
    }

    public double getFamilyIncome() {
        return familyIncome;
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

    public String getEmail() {
        return email;
    }

    public String getCellphone() {
        return cellphone;
    }

    public Student(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.id = builder.id;
        this.email = builder.email;
        this.cellphone = builder.cellphone;
        this.address = builder.address;
        this.school = builder.school;
        this.familyIncome = builder.familyIncome;

    }

    public static class Builder {
        private String name;
        private String surname;
        private String id;
        private String email;
        private String cellphone;
        private String address;
        private String school;
        private double familyIncome;

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

        public Builder email(String value) {
            this.email = value;
            return this;
        }

        public Builder cellphone(String value) {
            this.cellphone = value;
            return this;
        }

        public Builder address(String value) {
            this.address = value;
            return this;
        }

        public Builder school(String value) {
            this.school = value;
            return this;
        }

        public Builder familyIncome(double value) {
            this.familyIncome = value;
            return this;
        }


        public Student build() {
            return new Student(this);
        }


    }
}

