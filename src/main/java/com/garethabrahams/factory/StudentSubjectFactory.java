package com.garethabrahams.factory;

import com.garethabrahams.model.StudentSubjects;

public class StudentSubjectFactory {

    public static StudentSubjects subject (String subject, int marks){
        return new StudentSubjects.Builder()
                .subjectName(subject)
                .subjectMark(marks)
                .build();
    }
}
