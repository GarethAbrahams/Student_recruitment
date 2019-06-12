package com.garethabrahams.factory.General;

import com.garethabrahams.model.General.Course;
import com.garethabrahams.model.General.Facalty;
import com.garethabrahams.model.General.Institution;

public class CourseFactory {

    public static Course createCourse(String courseName, Facalty facalty, Institution institution){
        return new Course.Builder()
                .courseName(courseName)
                .facalty(facalty)
                .institution(institution)
                .build();
    }
}
