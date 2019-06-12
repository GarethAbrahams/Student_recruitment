package com.garethabrahams.model.Applicant;

public class ApplicantEmail {

    private String email;

    public ApplicantEmail() {
    }

    public String getEmail() {
        return email;
    }

    public ApplicantEmail(ApplicantEmail.Builder builder){
        this.email = builder.email;
    }

    public static class Builder {

        private String email;

        public ApplicantEmail.Builder email(String value){
            this.email = value;
            return this;
        }

        public ApplicantEmail.Builder copy(ApplicantEmail email){

            this.email = email.email;
            return this;
        }

        public ApplicantEmail build(){
            return new ApplicantEmail(this);
        }
    }
}
