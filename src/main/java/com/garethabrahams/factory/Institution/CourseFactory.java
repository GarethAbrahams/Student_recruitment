package com.garethabrahams.factory.Institution;

import com.garethabrahams.model.Institution.Course;

public class CourseFactory {

    public static Course createCourse(String courseName, String period, double cost){
        return new Course.Builder()
                .courseName(courseName)
                .period(period)
                .cost(cost)
                .build();
    }
}
