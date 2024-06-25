package com.programmingeasy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Controller
@SpringBootApplication


public class ProgrammingEasy {
    
    
    @RequestMapping("/")
    public String home() {
        return "Variables";
        //return "Variables.html";
    }

    public static void main(String[] args) {
        SpringApplication.run(ProgrammingEasy.class, args);
    }

}