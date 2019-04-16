package com.garethabrahams.model.Student;

public class StudentSubjects {

    private String subjectName;
    private int subjectMark;

    private StudentSubjects() {
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getSubjectMark() {
        return subjectMark;
    }

    public StudentSubjects(StudentSubjects.Builder builder) {
        this.subjectName = builder.subjectName;
        this.subjectMark = builder.subjectMark;
    }

    public static class Builder {
        private String subjectName;
        private int subjectMark;

        public StudentSubjects.Builder subjectName(String value) {
            this.subjectName = value;
            return this;
        }

        public StudentSubjects.Builder subjectMark(int value) {
            this.subjectMark = value;
            return this;
        }

        public StudentSubjects build() {
            return new StudentSubjects(this);
        }
    }
}
