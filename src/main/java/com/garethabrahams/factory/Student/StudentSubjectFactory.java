package com.garethabrahams.factory.Student;

import com.garethabrahams.model.Student.StudentSubjects;

public class StudentSubjectFactory {

    public static StudentSubjects subject (String subject, int marks){
        return new StudentSubjects.Builder()
                .subjectName(subject)
                .subjectMark(marks)
                .build();
    }
}
