package com.garethabrahams.controller.Applicant;

import com.garethabrahams.model.Applicant.ApplicantQualification;
import com.garethabrahams.service.Applicant.ApplicantQualificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/ApplicantQualification")
public class ApplicantQualificationController {

    @Autowired
    @Qualifier("ApplicantQualificationService")
    private ApplicantQualificationService service;

    @PostMapping("/create")
    @ResponseBody
    public ApplicantQualification create(ApplicantQualification qualification){
        return service.create(qualification);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  ApplicantQualification read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public ApplicantQualification update(ApplicantQualification qualification){
        return service.update(qualification);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ApplicantQualification> getAll(){
        return service.getAll();
    }
}
