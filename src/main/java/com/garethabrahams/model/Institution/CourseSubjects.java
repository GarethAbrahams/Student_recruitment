package com.garethabrahams.model.Institution;

public class CourseSubjects {

    private String courseSubject;
    private int subjectMarks;
    private CourseSubjects(){
    }

    public String getCourseSubject() {
        return courseSubject;
    }

    public int getSubjectMarks() {
        return subjectMarks;
    }

    public CourseSubjects(CourseSubjects.Builder builder) {
        this.courseSubject = builder.courseSubject;
        this.subjectMarks = builder.subjectMark;
    }

    public static class Builder {
        private String courseSubject;
        private int subjectMark;

        public CourseSubjects.Builder courseSubject(String value) {
            this.courseSubject = value;
            return this;
        }

        public CourseSubjects.Builder subjectMark(int value) {
            this.subjectMark = value;
            return this;
        }

        public CourseSubjects build() {
            return new CourseSubjects(this);
        }
    }
}
