package com.garethabrahams.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Applicant {

    @Id
    private String applicantID;
    private String name, surname, idNum;

    private Applicant() {

    }

    public  String getApplicantID(){
        return applicantID;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return idNum;
    }


    public Applicant(Builder builder) {
        this.applicantID = builder.applicantID;
        this.name = builder.name;
        this.surname = builder.surname;
        this.idNum = builder.idNum;
    }

    public static class Builder {
        private String applicantID;
        private String name;
        private String surname;
        private String idNum;


        public Builder applicantID(String value){
            this.applicantID = value;
            return this;
        }

        public Builder name(String value) {
            this.name = value;
            return this;
        }

        public Builder surname(String value) {
            this.surname = value;
            return this;
        }

        public Builder idNum(String value) {
            this.idNum = value;
            return this;
        }

        public Builder copy(Applicant applicant){
            this.applicantID = applicant.applicantID;
            this.idNum = applicant.idNum;
            this.name = applicant.name;
            this.surname = applicant.surname;
            return this;
        }

        public Applicant build() {
            return new Applicant(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "applicantID='" + applicantID + '\'' +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", idNum='" + idNum + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Applicant applicant = (Applicant) o;
            return applicant.applicantID.equals(applicant.applicantID);
        }


        @Override
        public int hashCode() {
            return Objects.hash(applicantID);
        }
    }
}

