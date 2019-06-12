package com.garethabrahams.controller.Applicant;

import com.garethabrahams.model.Applicant.ApplicantContact;
import com.garethabrahams.service.Applicant.ApplicantContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/ApplicantContact")
public class ApplicantContactController {

    @Autowired
    @Qualifier("ApplicantContactService")
    private ApplicantContactService service;

    @PostMapping("/create")
    @ResponseBody
    public ApplicantContact create(ApplicantContact contact){
        return service.create(contact);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  ApplicantContact read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public ApplicantContact update(ApplicantContact contact){
        return service.update(contact);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ApplicantContact> getAll(){
        return service.getAll();
    }
}
