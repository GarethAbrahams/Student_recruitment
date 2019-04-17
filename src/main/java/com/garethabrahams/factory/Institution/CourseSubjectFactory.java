package com.garethabrahams.factory.Institution;


import com.garethabrahams.model.Institution.CourseSubjects;

public class CourseSubjectFactory {

    public static CourseSubjects CreateCourseSubjects(String courseSubjectName, int courseSubjectMarks){
        return new CourseSubjects.Builder()
                .courseSubject(courseSubjectName)
                .subjectMark(courseSubjectMarks)
                .build();
    }
}
