package com.garethabrahams.controller.Applicant;

import com.garethabrahams.model.Applicant.ApplicantAddress;
import com.garethabrahams.service.Applicant.ApplicantAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/ApplicantAddress")
public class ApplicantAddressController {

    @Autowired
    @Qualifier("ApplicantAddressService")
    private ApplicantAddressService service;

    @PostMapping("/create")
    @ResponseBody
    public ApplicantAddress create(ApplicantAddress address){
        return service.create(address);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  ApplicantAddress read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public ApplicantAddress update(ApplicantAddress address){
        return service.update(address);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<ApplicantAddress> getAll(){
        return service.getAll();
    }

}
