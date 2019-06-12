package com.garethabrahams.controller.Staff;

import com.garethabrahams.model.Staff.StaffCity;
import com.garethabrahams.service.Staff.StaffCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/StaffCity")
public class StaffCityController {
    @Autowired
    @Qualifier("StaffCityService")
    private StaffCityService service;

    @PostMapping("/create")
    @ResponseBody
    public StaffCity create(StaffCity city){
        return service.create(city);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  StaffCity read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public StaffCity update(StaffCity city){
        return service.update(city);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<StaffCity> getAll(){
        return service.getAll();
    }
}
