package com.nagarro.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("hello")
    String hello(){
        return "Hello Jenkins DevOps king";
    }
}
