package com.garethabrahams.model.Student;

public class StudentCourse {
    private String courseName, institution, period;
    private double cost;

    public String getCourseName() {
        return courseName;
    }

    public String getInstitution() {
        return institution;
    }

    public String getPeriod() {
        return period;
    }

    public double getCost() {
        return cost;
    }

    public StudentCourse(StudentCourse.Builder builder) {
        this.courseName = builder.courseName;
        this.institution = builder.institution;
        this.period = builder.period;
        this.cost = builder.cost;
    }

    public static class Builder {
        private String courseName,institution,period;
        private double cost;

        public StudentCourse.Builder courseName(String value) {
            this.courseName = value;
            return this;
        }

        public StudentCourse.Builder institution(String value) {
            this.institution = value;
            return this;
        }

        public StudentCourse.Builder period(String value) {
            this.period = value;
            return this;
        }

        public StudentCourse.Builder cost(double value) {
            this.cost = value;
            return this;
        }

        public StudentCourse build() {
            return new StudentCourse(this);
        }
    }
}
