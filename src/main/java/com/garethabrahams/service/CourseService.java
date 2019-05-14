package com.garethabrahams.service;

import com.garethabrahams.model.Course;

import java.util.Set;

public interface CourseService extends IService <Course,String>{
    Set<Course> getAll();
}
