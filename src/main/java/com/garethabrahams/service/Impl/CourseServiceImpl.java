package com.garethabrahams.service.Impl;

import com.garethabrahams.model.Course;
import com.garethabrahams.repository.CourseRepository;
import com.garethabrahams.repository.Impl.CourseRepositoryImpl;
import com.garethabrahams.service.CourseService;

import java.util.Set;

public class CourseServiceImpl implements CourseService {

    private static CourseService service = null;
    private CourseRepository repository;

    private CourseServiceImpl(){

        this.repository = CourseRepositoryImpl.getRepository();
    }

    public static CourseService getCourseService(){
        if (service==null)
            service = new CourseServiceImpl();
        return service;
    }

    @Override
    public Set<Course> getAll() {
        return this.repository.getAll();
    }

    @Override
    public Course create(Course e) {
        return this.repository.create(e);
    }

    @Override
    public Course read(String s) {
        return this.repository.read(s);
    }

    @Override
    public Course update(Course e) {
        return this.repository.update(e);
    }

    @Override
    public void delete(String s) {
        this.repository.delete(s);
    }
}
