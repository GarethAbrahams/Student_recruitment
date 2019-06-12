package com.garethabrahams.service.General;

import com.garethabrahams.model.General.Course;
import com.garethabrahams.service.IService;

import java.util.Set;

public interface CourseService extends IService<Course,String> {
    Set<Course> getAll();
}
