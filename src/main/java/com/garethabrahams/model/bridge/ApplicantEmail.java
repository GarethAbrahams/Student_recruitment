package com.garethabrahams.model.bridge;

public class ApplicantEmail {

    private String applicantID, emailID;

    public ApplicantEmail() {
    }

    public String getApplicantID() {
        return applicantID;
    }

    public String getEmailID() {
        return emailID;
    }

    public ApplicantEmail(Builder builder) {
        this.applicantID = builder.applicantID;
        this.emailID = builder.emailID;
    }

    public static class Builder {
        private String applicantID;
        private String emailID;


        public Builder applicantID(String value) {
            this.applicantID = value;
            return this;
        }

        public Builder emailID(String value) {
            this.emailID = value;
            return this;
        }

        public Builder copy(ApplicantEmail ApplicantEmail) {
            this.applicantID = ApplicantEmail.applicantID;
            this.emailID = ApplicantEmail.emailID;
            return this;
        }

        public ApplicantEmail build() {
            return new ApplicantEmail(this);
        }
    }
        @Override
        public String toString() {
            return "ApplicantEmail{" +
                    "applicantID='" + applicantID + '\'' +
                    ", emailID='" + emailID + '\'' +
                    '}';
        }
}
