package com.garethabrahams.model.bridge;

public class ApplicantGender {

    private String applicantID, genderID;

    public ApplicantGender(){ }

    public String getApplicantID(){
        return applicantID;
    }

    public String getGenderID(){
        return genderID;
    }

    public ApplicantGender(Builder builder) {
        this.applicantID = builder.applicantID;
        this.genderID = builder.genderID;
    }

    public static class Builder {
        private String applicantID;
        private String genderID;


        public Builder applicantID(String value) {
            this.applicantID = value;
            return this;
        }

        public Builder genderID(String value) {
            this.genderID = value;
            return this;
        }

        public Builder copy(ApplicantGender ApplicantGender) {
            this.applicantID = ApplicantGender.applicantID;
            this.genderID = ApplicantGender.genderID;
            return this;
        }

        public ApplicantGender build() {
            return new ApplicantGender(this);
        }
    }

    @Override
    public String toString() {
        return "ApplicantGender{" +
                "applicantID='" + applicantID + '\'' +
                ", genderID='" + genderID + '\'' +
                '}';
    }
}
