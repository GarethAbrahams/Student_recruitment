package com.garethabrahams.repository.General;

import com.garethabrahams.model.General.Course;
import com.garethabrahams.repository.IRepository;

import java.util.Set;

public interface CourseRepository extends IRepository<Course, String> {
    Set<Course> getAll();
}
