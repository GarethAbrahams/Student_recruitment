package com.garethabrahams.controller;

import com.garethabrahams.model.Applicant.Applicant;
import com.garethabrahams.service.Applicant.ApplicantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Applicant")
public class ApplicantController {
    @Autowired
    @Qualifier("ApplicantService")
    private ApplicantService service;

    @PostMapping("/create")
    @ResponseBody
    public Applicant create(Applicant applicant){
        return service.create(applicant);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  Applicant read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Applicant update(Applicant applicant){
        return service.update(applicant);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Applicant> getAll(){
        return service.getAll();
    }
}
