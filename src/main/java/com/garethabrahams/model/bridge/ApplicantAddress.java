package com.garethabrahams.model.bridge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApplicantAddress {

    @Id
    private String applicantID;
    private String addressID;

    public ApplicantAddress(){

    }

    public String getApplicantID() {
        return applicantID;
    }

    public String getAddressID() {
        return addressID;
    }

    public ApplicantAddress(Builder builder) {
        this.applicantID = builder.applicantID;
        this.addressID = builder.addressID;
    }

    public static class Builder {
        private String applicantID;
        private String addressID;


        public Builder applicantID(String value) {
            this.applicantID = value;
            return this;
        }

        public Builder addressID(String value) {
            this.addressID = value;
            return this;
        }

        public Builder copy(ApplicantAddress applicantAddress) {
            this.applicantID = applicantAddress.applicantID;
            this.addressID = applicantAddress.addressID;
            return this;
        }

        public ApplicantAddress build() {
            return new ApplicantAddress(this);
        }
    }
    @Override
    public String toString() {
        return "ApplicantAddress{" +
                "applicantID='" + applicantID + '\'' +
                ", addressID='" + addressID + '\'' +
                '}';
    }
}
