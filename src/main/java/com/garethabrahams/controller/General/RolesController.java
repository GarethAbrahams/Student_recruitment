package com.garethabrahams.controller.General;

import com.garethabrahams.model.General.Roles;
import com.garethabrahams.service.General.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Roles")
public class RolesController {

    @Autowired
    @Qualifier("RolesService")
    private RolesService service;

    @PostMapping("/create")
    @ResponseBody
    public Roles create(Roles roles){
        return service.create(roles);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  Roles read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Roles update(Roles roles){
        return service.update(roles);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Roles> getAll(){
        return service.getAll();
    }
}
