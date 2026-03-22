package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello, Spring Boot!";
    }

    @GetMapping("/about")
    public String about() {
        return "This is a simple Spring Boot project.";
    }
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
}