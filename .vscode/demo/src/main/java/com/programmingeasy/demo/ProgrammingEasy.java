package com.programmingeasy.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication

public class ProgrammingEasy {
    
    @RequestMapping("/")
    String home() {
        return "This is the index page!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ProgrammingEasy.class, args);
    }

}