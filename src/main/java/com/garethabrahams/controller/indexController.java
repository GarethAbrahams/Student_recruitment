package com.garethabrahams.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexController {
    @GetMapping("/")
    @ResponseBody
    public String getHome(){
        return "Hello, you have reached the HR RECRUITMENT SYSTEM";
    }
}
