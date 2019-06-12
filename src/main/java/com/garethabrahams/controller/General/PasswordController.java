package com.garethabrahams.controller.General;

import com.garethabrahams.model.General.Password;
import com.garethabrahams.service.General.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Password")
public class PasswordController {

    @Autowired
    @Qualifier("PasswordService")
    private PasswordService service;

    @PostMapping("/create")
    @ResponseBody
    public Password create(Password password){
        return service.create(password);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public Password read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Password update(Password password){
        return service.update(password);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Password> getAll(){
        return service.getAll();
    }
}
