package com.garethabrahams.factory;

import com.garethabrahams.model.Course;
import com.garethabrahams.model.Facalty;
import com.garethabrahams.model.Institution;

public class CourseFactory {

    public static Course createCourse(String courseName, Facalty facalty, Institution institution){
        return new Course.Builder()
                .courseName(courseName)
                .facalty(facalty)
                .institution(institution)
                .build();
    }
}
