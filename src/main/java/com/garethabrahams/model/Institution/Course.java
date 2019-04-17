package com.garethabrahams.model.Institution;

public class Course {
    private String courseName, period;
    private double cost;

    public String getCourseName() {
        return courseName;
    }

    public String getPeriod() {
        return period;
    }

    public double getCost() {
        return cost;
    }

    public Course(Course.Builder builder) {
        this.courseName = builder.courseName;
        this.period = builder.period;
        this.cost = builder.cost;
    }

    public static class Builder {
        private String courseName,period;
        private double cost;

        public Course.Builder courseName(String value) {
            this.courseName = value;
            return this;
        }


        public Course.Builder period(String value) {
            this.period = value;
            return this;
        }

        public Course.Builder cost(double value) {
            this.cost = value;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
