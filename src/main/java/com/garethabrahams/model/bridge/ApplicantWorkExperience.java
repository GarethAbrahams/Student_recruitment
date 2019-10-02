package com.garethabrahams.model.bridge;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApplicantWorkExperience {

    @Id
    private String applicantID;
    private String workID;

    public ApplicantWorkExperience() {
    }

    public String getApplicantID() {
        return applicantID;
    }

    public String getWorkID() {
        return workID;
    }

    public ApplicantWorkExperience(Builder builder) {
        this.applicantID = builder.applicantID;
        this.workID = builder.workID;
    }

    public static class Builder {
        private String applicantID;
        private String workID;


        public Builder applicantID(String value) {
            this.applicantID = value;
            return this;
        }

        public Builder workID(String value) {
            this.workID = value;
            return this;
        }

        public Builder copy(ApplicantWorkExperience applicantWorkExperience) {
            this.applicantID = applicantWorkExperience.applicantID;
            this.workID = applicantWorkExperience.workID;
            return this;
        }

        public ApplicantWorkExperience build() {
            return new ApplicantWorkExperience(this);
        }
    }

    @Override
    public String toString() {
        return "ApplicantWorkExperience{" +
                "applicantID='" + applicantID + '\'' +
                ", workID='" + workID + '\'' +
                '}';
    }
}
