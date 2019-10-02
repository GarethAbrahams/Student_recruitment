package com.garethabrahams.model.bridge;

public class ApplicantUserDetails {

    private String applicantID, username;

    public ApplicantUserDetails() {
    }

    public String getApplicantID() {
        return applicantID;
    }

    public String getUsername() {
        return username;
    }

    public ApplicantUserDetails(Builder builder) {
        this.applicantID = builder.applicantID;
        this.username = builder.username;
    }

    public static class Builder {
        private String applicantID;
        private String username;


        public Builder applicantID(String value) {
            this.applicantID = value;
            return this;
        }

        public Builder username(String value) {
            this.username = value;
            return this;
        }

        public Builder copy(ApplicantUserDetails applicantUserDetails) {
            this.applicantID = applicantUserDetails.applicantID;
            this.username = applicantUserDetails.username;
            return this;
        }

        public ApplicantUserDetails build() {
            return new ApplicantUserDetails(this);
        }
    }

    @Override
    public String toString() {
        return "ApplicantUserDetails{" +
                "ApplicantID='" + applicantID + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
