package com.garethabrahams.controller.General;

import com.garethabrahams.model.General.Course;
import com.garethabrahams.service.General.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Course")
public class CourseController {
    @Autowired
    @Qualifier("CourseService")
    private CourseService service;

    @PostMapping("/create")
    @ResponseBody
    public Course create(Course course){
        return service.create(course);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  Course read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Course update(Course course){
        return service.update(course);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Course> getAll(){
        return service.getAll();
    }
}
