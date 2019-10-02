package com.garethabrahams.model;

public class Qualification {

    private String qualificationID;
    private String qualificationName, yearObtained;
    private String placeObtained;

    public Qualification() {
    }

    public String getQualificationID(){
        return qualificationID;
    }

    public String getQualificationName() {
        return qualificationName;
    }

    public String getYearObtained() {
        return yearObtained;
    }

    public String getPlaceObtained() {
        return placeObtained;
    }

    public Qualification(Qualification.Builder builder){
        this.qualificationID = builder.qualificationID;
        this.qualificationName = builder.qualificationName;
        this.yearObtained = builder.yearObtained;
        this.placeObtained = builder.placeObtained;
    }

    public static class Builder {
        private String qualificationID;
        private String qualificationName, yearObtained;
        private String placeObtained;

        public Qualification.Builder qualificationID(String value){
            this.qualificationID = value;
            return this;
        }
        public Qualification.Builder qualificationName(String value){
            this.qualificationName = value;
            return this;
        }

        public Qualification.Builder yearObtained(String value){
            this.yearObtained = value;
            return this;
        }

        public Qualification.Builder placeObtained(String value){
            this.placeObtained = value;
            return this;
        }

        public Qualification.Builder copy(Qualification course){
            this.qualificationID = course.qualificationID;
            this.qualificationName = course.qualificationName;
            this.yearObtained = course.yearObtained;
            this.placeObtained = course.placeObtained;
            return this;
        }

        public Qualification build(){
            return new Qualification(this);
        }
    }
}
