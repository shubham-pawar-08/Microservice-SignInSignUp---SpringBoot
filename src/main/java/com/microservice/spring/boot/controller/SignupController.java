package com.microservice.spring.boot.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SignupController {
    
    @GetMapping("/")
    public String getMethodName() {
        return "SignUp Ready";
    }
/*
    @GetMapping("/")
    public String getMethodName() {
        return "SignUp Ready";
    }
   */  
}
