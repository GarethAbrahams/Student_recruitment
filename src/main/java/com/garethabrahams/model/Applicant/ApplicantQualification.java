package com.garethabrahams.model.Applicant;

import com.garethabrahams.model.General.Course;

public class ApplicantQualification {

    private String QualificationName, yearObtained;
    private Course course;

    public ApplicantQualification() {
    }

    public String getQualificationName() {
        return QualificationName;
    }

    public String getYearObtained() {
        return yearObtained;
    }

    public Course getCourse() {
        return course;
    }

    public ApplicantQualification(ApplicantQualification.Builder builder){
        this.QualificationName = builder.QualificationName;
        this.yearObtained = builder.yearObtained;
        this.course = builder.course;
    }

    public static class Builder {
        private String QualificationName, yearObtained;
        private Course course;

        public ApplicantQualification.Builder QualificationName(String value){
            this.QualificationName = value;
            return this;
        }

        public ApplicantQualification.Builder yearObtained(String value){
            this.yearObtained = value;
            return this;
        }

        public ApplicantQualification.Builder course(Course value){
            this.course = value;
            return this;
        }

        public ApplicantQualification.Builder copy(ApplicantQualification course){
            this.QualificationName = course.QualificationName;
            this.yearObtained = course.yearObtained;
            this.course = course.course;
            return this;
        }

        public ApplicantQualification build(){
            return new ApplicantQualification(this);
        }
    }
}
