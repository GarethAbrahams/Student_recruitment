package com.garethabrahams.factory.Institution;

import com.garethabrahams.model.Institution.Course;
import com.garethabrahams.model.Institution.Facalty;
import com.garethabrahams.model.Institution.Institution;

public class CourseFactory {

    public static Course createCourse(String courseName, Facalty facalty, Institution institution){
        return new Course.Builder()
                .courseName(courseName)
                .facalty(facalty)
                .institution(institution)
                .build();
    }
}
