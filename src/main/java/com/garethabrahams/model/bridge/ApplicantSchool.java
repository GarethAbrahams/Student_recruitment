package com.garethabrahams.model.bridge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApplicantSchool {

    @Id
    private String applicantID;
    private String schoolID;

    public ApplicantSchool() {
    }

    public String getApplicantID() {
        return applicantID;
    }

    public String getSchoolID() {
        return schoolID;
    }

    public ApplicantSchool(Builder builder) {
        this.applicantID = builder.applicantID;
        this.schoolID = builder.schoolID;
    }

    public static class Builder {
        private String applicantID;
        private String schoolID;


        public Builder applicantID(String value) {
            this.applicantID = value;
            return this;
        }

        public Builder schoolID(String value) {
            this.schoolID = value;
            return this;
        }

        public Builder copy(ApplicantSchool applicantSchool) {
            this.applicantID = applicantSchool.applicantID;
            this.schoolID = applicantSchool.schoolID;
            return this;
        }

        public ApplicantSchool build() {
            return new ApplicantSchool(this);
        }
    }

    @Override
    public String toString() {
        return "ApplicantSchool{" +
                "applicantID='" + applicantID + '\'' +
                ", schoolID='" + schoolID + '\'' +
                '}';
    }
}
