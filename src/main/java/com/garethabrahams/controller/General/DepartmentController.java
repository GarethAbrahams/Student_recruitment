package com.garethabrahams.controller.General;

import com.garethabrahams.model.General.Department;
import com.garethabrahams.service.General.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Department")
public class DepartmentController {

    @Autowired
    @Qualifier("DepartmentService")
    private DepartmentService service;

    @PostMapping("/create")
    @ResponseBody
    public Department create(Department dept){
        return service.create(dept);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  Department read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Department update(Department dept){
        return service.update(dept);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Department> getAll(){
        return service.getAll();
    }
}
