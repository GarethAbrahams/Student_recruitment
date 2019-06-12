package com.garethabrahams.controller.Applicant;

import com.garethabrahams.model.Applicant.ApplicantCity;
import com.garethabrahams.service.Applicant.ApplicantCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/ApplicantCity")
public class ApplicantCityController {

    @Autowired
    @Qualifier("ApplicantCityService")
    private ApplicantCityService service;

    @PostMapping("/create")
    @ResponseBody
    public ApplicantCity create(ApplicantCity city){
        return service.create(city);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  ApplicantCity read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public ApplicantCity update(ApplicantCity city){
        return service.update(city);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ApplicantCity> getAll(){
        return service.getAll();
    }

}
