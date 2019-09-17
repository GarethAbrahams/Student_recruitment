package com.garethabrahams.controller.Staff;

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

    @PostMapping("/create/{staff}")
    @ResponseBody
    public Staff create(@PathVariable Staff staff){
        return service.create(staff);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  Staff read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update/{staff}")
    @ResponseBody
    public Staff update(@PathVariable Staff staff){
        return service.update(staff);
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
