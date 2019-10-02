package com.garethabrahams.model.bridge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApplicantOutcome {

    @Id
    private String applicantID;
    private String outcomeID;

    public ApplicantOutcome() {
    }

    public String getApplicantID() {
        return applicantID;
    }

    public String getOutcomeID() {
        return outcomeID;
    }

    public ApplicantOutcome(Builder builder) {
        this.applicantID = builder.applicantID;
        this.outcomeID = builder.outcomeID;
    }

    public static class Builder {
        private String applicantID;
        private String outcomeID;

        public Builder applicantID(String value){
            this.applicantID = value;
            return this;
        }

        public Builder outcomeID(String value) {
            this.outcomeID = value;
            return this;
        }


        public Builder copy(ApplicantOutcome outcome){
            this.applicantID= outcome.applicantID;
            this.outcomeID = outcome.outcomeID;
            return this;
        }

        public ApplicantOutcome build() {
            return new ApplicantOutcome(this);
        }
    }
}
