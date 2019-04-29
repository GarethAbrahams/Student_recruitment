package com.garethabrahams.repository;

import com.garethabrahams.model.Institution.Course;

import java.util.Set;

public interface CourseRepository extends IRepository<Course, String> {
    Set<Course> getAll();
}
