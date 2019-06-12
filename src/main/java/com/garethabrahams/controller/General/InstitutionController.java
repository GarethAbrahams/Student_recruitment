package com.garethabrahams.controller.General;

import com.garethabrahams.model.General.Institution;
import com.garethabrahams.service.General.InstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Institution")
public class InstitutionController {

    @Autowired
    @Qualifier("InstitutionService")
    private InstitutionService service;

    @PostMapping("/create")
    @ResponseBody
    public Institution create(Institution institution){
        return service.create(institution);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  Institution read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Institution update(Institution institution){
        return service.update(institution);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Institution> getAll(){
        return service.getAll();
    }
}
