package com.garethabrahams.controller.Applicant;

import com.garethabrahams.model.Applicant.ApplicantSchool;
import com.garethabrahams.service.Applicant.ApplicantSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/ApplicantSchool")
public class ApplicantSchoolController {

    @Autowired
    @Qualifier("ApplicantSchoolService")
    private ApplicantSchoolService service;

    @PostMapping("/create")
    @ResponseBody
    public ApplicantSchool create(ApplicantSchool school){
        return service.create(school);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  ApplicantSchool read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public ApplicantSchool update(ApplicantSchool school){
        return service.update(school);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ApplicantSchool> getAll(){
        return service.getAll();
    }
}
