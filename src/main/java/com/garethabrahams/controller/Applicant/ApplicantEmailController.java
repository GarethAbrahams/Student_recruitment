package com.garethabrahams.controller.Applicant;

import com.garethabrahams.model.Applicant.ApplicantEmail;
import com.garethabrahams.service.Applicant.ApplicantEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/ApplicantEmail")
public class ApplicantEmailController {

    @Autowired
    @Qualifier("ApplicantEmailService")
    private ApplicantEmailService service;

    @PostMapping("/create")
    @ResponseBody
    public ApplicantEmail create(ApplicantEmail email){
        return service.create(email);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  ApplicantEmail read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public ApplicantEmail update(ApplicantEmail email){
        return service.update(email);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ApplicantEmail> getAll(){
        return service.getAll();
    }
}
