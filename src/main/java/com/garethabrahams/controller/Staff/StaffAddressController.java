package com.garethabrahams.controller.Staff;

import com.garethabrahams.model.Staff.StaffAddress;
import com.garethabrahams.service.Staff.StaffAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/StaffAddress")
public class StaffAddressController {

    @Autowired
    @Qualifier("StaffAddressService")
    private StaffAddressService service;

    @PostMapping("/create")
    @ResponseBody
    public StaffAddress create(StaffAddress address){
        return service.create(address);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  StaffAddress read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public StaffAddress update(StaffAddress address){
        return service.update(address);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<StaffAddress> getAll(){
        return service.getAll();
    }
}
