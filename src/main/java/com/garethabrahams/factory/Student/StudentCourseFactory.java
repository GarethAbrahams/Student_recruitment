package com.garethabrahams.factory.Student;

import com.garethabrahams.model.Student.StudentCourse;

public class StudentCourseFactory {

    public static StudentCourse course (String courseName, String institution, String period, double cost){
        return new StudentCourse.Builder()
                .courseName(courseName)
                .institution(institution)
                .period(period)
                .cost(cost)
                .build();
    }
}
