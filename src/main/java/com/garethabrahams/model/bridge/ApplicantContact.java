package com.garethabrahams.model.bridge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApplicantContact {

    @Id
    private String applicantID;
    private String contactID;

    public ApplicantContact() {
    }

    public String getApplicantID() {
        return applicantID;
    }

    public String getContactID() {
        return contactID;
    }

    public ApplicantContact(Builder builder) {
        this.applicantID = builder.applicantID;
        this.contactID = builder.contactID;
    }

    public static class Builder {
        private String applicantID;
        private String contactID;


        public Builder applicantID(String value) {
            this.applicantID = value;
            return this;
        }

        public Builder contactID(String value) {
            this.contactID = value;
            return this;
        }

        public Builder copy(ApplicantContact applicantContact) {
            this.applicantID = applicantContact.applicantID;
            this.contactID = applicantContact.contactID;
            return this;
        }

        public ApplicantContact build() {
            return new ApplicantContact(this);
        }
    }
    @Override
    public String toString() {
        return "ApplicantContact{" +
                "applicantID='" + applicantID + '\'' +
                ", contactID='" + contactID + '\'' +
                '}';
    }
}
