package com.garethabrahams.controller.Staff;

import com.garethabrahams.model.Staff.StaffEmail;
import com.garethabrahams.service.Staff.StaffEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/StaffEmail")
public class StaffEmailController {

    @Autowired
    @Qualifier("StaffEmailService")
    private StaffEmailService service;

    @PostMapping("/create")
    @ResponseBody
    public StaffEmail create(StaffEmail email){
        return service.create(email);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  StaffEmail read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public StaffEmail update(StaffEmail email){
        return service.update(email);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<StaffEmail> getAll(){
        return service.getAll();
    }
}
