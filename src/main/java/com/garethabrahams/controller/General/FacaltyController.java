package com.garethabrahams.controller.General;

import com.garethabrahams.model.General.Facalty;
import com.garethabrahams.service.General.FacaltyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/Facalty")
public class FacaltyController {

    @Autowired
    @Qualifier("FacaltyService")
    private FacaltyService service;

    @PostMapping("/create")
    @ResponseBody
    public Facalty create(Facalty facalty){
        return service.create(facalty);
    }

    @GetMapping("/read/{id}")
    @ResponseBody
    public  Facalty read(@PathVariable String id){
        return service.read(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Facalty update(Facalty facalty){
        return service.update(facalty);
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public void delete(@PathVariable String id){
        service.delete(id);
    }

    @GetMapping("/read/all")
    @ResponseBody
    public Set<Facalty> getAll(){
        return service.getAll();
    }

}
