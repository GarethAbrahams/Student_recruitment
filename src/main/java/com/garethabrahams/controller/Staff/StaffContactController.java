package com.garethabrahams.controller.Staff;

import com.garethabrahams.model.Staff.StaffContact;
import com.garethabrahams.service.Staff.StaffContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/StaffContact")
public class StaffContactController {
    @Autowired
    @Qualifier("StaffContactService")
    private StaffContactService service;

    @PostMapping("/create")
    @ResponseBody
    public StaffContact create(StaffContact contact){
        return service.create(contact);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  StaffContact read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public StaffContact update(StaffContact contact){
        return service.update(contact);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<StaffContact> getAll(){
        return service.getAll();
    }
}
