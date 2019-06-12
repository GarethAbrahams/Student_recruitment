package com.garethabrahams.service.General.Impl;

import com.garethabrahams.model.General.Course;
import com.garethabrahams.repository.General.CourseRepository;
import com.garethabrahams.repository.General.Impl.CourseRepositoryImpl;
import com.garethabrahams.service.General.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service("CourseService")
public class CourseServiceImpl implements CourseService {

    private static CourseService service = null;

    @Autowired
    @Qualifier("CourseRepository")
    private CourseRepository repository;

    private CourseServiceImpl(){

        repository = CourseRepositoryImpl.getRepository();
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
