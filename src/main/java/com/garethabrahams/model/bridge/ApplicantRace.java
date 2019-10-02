package com.garethabrahams.model.bridge;

public class ApplicantRace {

    private String applicantID, raceID;

    public ApplicantRace(){ }

    public String getApplicantID(){
        return applicantID;
    }

    public String getRaceID(){
        return raceID;
    }

    public ApplicantRace (Builder builder) {
        this.applicantID = builder.applicantID;
        this.raceID = builder.raceID;
    }

    public static class Builder {
        private String applicantID;
        private String raceID;


        public Builder applicantID(String value) {
            this.applicantID = value;
            return this;
        }

        public Builder raceID(String value) {
            this.raceID = value;
            return this;
        }

        public Builder copy(ApplicantRace ApplicantRace) {
            this.applicantID = ApplicantRace.applicantID;
            this.raceID = ApplicantRace.raceID;
            return this;
        }

        public ApplicantRace build() {
            return new ApplicantRace(this);
        }
    }

    @Override
    public String toString() {
        return "ApplicantRace{" +
                "applicantID='" + applicantID + '\'' +
                ", raceID='" + raceID + '\'' +
                '}';
    }
}
