package com.garethabrahams.model.bridge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApplicantQualification {

    @Id
    private String applicantID;
    private String qualificationID;

    public ApplicantQualification() {
    }

    public String getApplicantID() {
        return applicantID;
    }

    public String getQualificationID() {
        return qualificationID;
    }

    public ApplicantQualification(Builder builder) {
        this.applicantID = builder.applicantID;
        this.qualificationID = builder.qualificationID;
    }

    public static class Builder {
        private String applicantID;
        private String qualificationID;


        public Builder applicantID(String value) {
            this.applicantID = value;
            return this;
        }

        public Builder qualificationID(String value) {
            this.qualificationID = value;
            return this;
        }

        public Builder copy(ApplicantQualification applicantQualification) {
            this.applicantID = applicantQualification.applicantID;
            this.qualificationID = applicantQualification.qualificationID;
            return this;
        }

        public ApplicantQualification build() {
            return new ApplicantQualification(this);
        }
    }

    @Override
    public String toString() {
        return "ApplicantQualification{" +
                "applicantID='" + applicantID + '\'' +
                ", qualificationID='" + qualificationID + '\'' +
                '}';
    }
}
