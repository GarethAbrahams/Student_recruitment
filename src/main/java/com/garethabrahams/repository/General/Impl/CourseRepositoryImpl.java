package com.garethabrahams.repository.General.Impl;

import com.garethabrahams.model.General.Course;
import com.garethabrahams.repository.General.CourseRepository;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository("CourseRepository")
public class CourseRepositoryImpl implements CourseRepository {
    private static CourseRepositoryImpl repository = null;
    private Set<Course> courses;

    //HashSet - Store in memory
    private CourseRepositoryImpl() {

        this.courses = new HashSet<>();
    }

    public static CourseRepositoryImpl getRepository(){
        if(repository==null)
            repository = new CourseRepositoryImpl();

        return repository;
    }

    public Course CourseSearch(final String c){
        for (Course course: this.courses){
            if (course.getCourseName().equals(c))
                return course;
        }
        return null;
    }

    @Override
    public Set<Course> getAll() {
        return this.courses;
    }

    @Override
    public Course create(Course course) {
        this.courses.add(course);
        return course;
    }

    @Override
    public Course update(Course c) {
        Course courseOld = CourseSearch(c.getCourseName());
        if (courseOld != null){
            Course courseNew = new Course.Builder()
                    .copy(c)
                    .build();
            return create(courseNew);
        }
        return null;
    }

    @Override
    public void delete(String c) {
        this.courses.remove(c);
    }

    @Override
    public Course read(String c) {
        return CourseSearch(c);
    }
}
