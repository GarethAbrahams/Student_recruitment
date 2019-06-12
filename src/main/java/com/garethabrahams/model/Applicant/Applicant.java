package com.garethabrahams.model.Applicant;

import java.util.Objects;

public class Applicant {

    private String name, surname, id;
    private ApplicantAddress address;
    private ApplicantContact contact;
    private ApplicantEmail email;

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

    public  String getAddress(){
        return address.getAddress();
    }

    public String getContactPhone(){
        return contact.getPhone();
    }

    public String getContactCell(){
        return contact.getCellphone();
    }

    public String getEmail(){
        return email.getEmail();
    }


    public Applicant(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.id = builder.id;
        this.address = builder.address;
        this.contact = builder.contact;
        this.email = builder.email;

    }

    public static class Builder {
        private ApplicantAddress address;
        private String name;
        private String surname;
        private String id;
        private ApplicantContact contact;
        private ApplicantEmail email;

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

        public Builder address(ApplicantAddress value){
            this.address = value;
            return this;
        }

        public Builder contact(ApplicantContact value){
            this.contact = value;
            return this;
        }

        public Builder email(ApplicantEmail value){
            this.email = value;
            return this;
        }

        public Builder copy(Applicant applicant){
            this.id = applicant.id;
            this.name = applicant.name;
            this.surname = applicant.surname;
            this.address = applicant.address;
            this.contact = applicant.contact;
            this.email = applicant.email;
            return this;
        }

        public Applicant build() {
            return new Applicant(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", id='" + id + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Applicant applicant = (Applicant) o;
            return applicant.id.equals(applicant.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}

