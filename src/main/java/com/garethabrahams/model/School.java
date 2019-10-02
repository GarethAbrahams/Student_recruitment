package com.garethabrahams.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class School {

    @Id
    private String schoolID;
    private String schoolName, city, yearMatric;

    public School() {
    }

    public String getSchoolID(){
        return schoolID;
    }

    public String getSchoolname() {
        return schoolName;
    }

    public String getCity() {
        return city;
    }

    public String getYearMatric() {
        return yearMatric;
    }

    public School(School.Builder builder) {
        this.schoolID = builder.schoolID;
        this.schoolName = builder.schoolName;
        this.city = builder.city;
        this.yearMatric = builder.yearMatric;
    }

    public static class Builder {
        private String schoolID;
        private String schoolName;
        private String city;
        private String yearMatric;


        public School.Builder schoolID(String value){
            this.schoolID = value;
            return this;
        }

        public School.Builder schoolName(String value) {
            this.schoolName = value;
            return this;
        }

        public School.Builder city(String value) {
            this.city = value;
            return this;
        }

        public School.Builder yearMatric(String value) {
            this.yearMatric = value;
            return this;
        }

        public School.Builder copy(School school){
            this.schoolID = school.schoolID;
            this.schoolName = school.schoolName;
            this.city = school.city;
            this.yearMatric = school.yearMatric;
            return this;
        }

        public School build() {

            return new School(this);
        }


    }
}
