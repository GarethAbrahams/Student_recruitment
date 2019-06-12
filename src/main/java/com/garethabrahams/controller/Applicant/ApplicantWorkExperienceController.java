package com.garethabrahams.controller.Applicant;

import com.garethabrahams.model.Applicant.ApplicantWorkExperience;
import com.garethabrahams.service.Applicant.ApplicantWorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Applicant")
public class ApplicantWorkExperienceController {

    @Autowired
    @Qualifier("ApplicantWorkExperienceService")
    private ApplicantWorkExperienceService service;

    @PostMapping("/create")
    @ResponseBody
    public ApplicantWorkExperience create(ApplicantWorkExperience work){
        return service.create(work);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  ApplicantWorkExperience read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public ApplicantWorkExperience update(ApplicantWorkExperience work){
        return service.update(work);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ApplicantWorkExperience> getAll(){
        return service.getAll();
    }
}
