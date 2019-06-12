package com.garethabrahams.controller;

import com.garethabrahams.model.Staff.Staff;
import com.garethabrahams.service.Staff.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Staff")
public class StaffController {
    @Autowired
    @Qualifier("StaffService")
    private StaffService service;

    @PostMapping("/create")
    @ResponseBody
    public Staff create(Staff applicant){
        return service.create(applicant);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  Staff read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Staff update(Staff applicant){
        return service.update(applicant);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Staff> getAll(){
        return service.getAll();
    }
}
