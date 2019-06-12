package com.garethabrahams.controller.General;

import com.garethabrahams.model.General.Username;
import com.garethabrahams.service.General.UsernameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Username")
public class UsernameController {

    @Autowired
    @Qualifier("UsernameService")
    private UsernameService service;

    @PostMapping("/create")
    @ResponseBody
    public Username create(Username username){
        return service.create(username);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  Username read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Username update(Username username){
        return service.update(username);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Username> getAll(){
        return service.getAll();
    }
}
