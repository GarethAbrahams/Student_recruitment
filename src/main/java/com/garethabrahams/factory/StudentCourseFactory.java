package com.garethabrahams.factory;

import com.garethabrahams.model.StudentCourse;

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